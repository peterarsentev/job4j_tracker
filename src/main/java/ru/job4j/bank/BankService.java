package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы
 * @author Veronika Lapenok
 */
public class BankService {
    /**
     * Хранение пользователей осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему,
     * если такого пользователя еще нет
     * @param user новый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счёт в банковскую систему,
     * если в системе есть пользователь с с передаваемым номером паспорта
     * и в списке счетов у этого пользователя нет передаваемого счёта
     * @param passport номер паспорта
     * @param account банковский счёт
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя банковской системы
     * по номеру паспорта
     * @param passport номер паспорта
     * @return пользователя или null, если пользователя с
     * передаваемым номером паспорта не в коллекции
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод для поиска банковского счёта по пользователю
     * банковской системы, а затем по реквизиту, если пользователь
     * найден
     * @param passport номер паспорта
     * @param requisite реквизит банковского счёта
     * @return банковский счёт или null, если пользователь с передаваемым
     * номером паспорта не найден в системе либо нет счёта с передаваемым реквизитом
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод перечисляет денежную сумму с одного банковского
     * счёта на другой
     * @param srcPassport номер паспорта пользователя счёта,
     *                    с которого перечисляются деньги
     * @param srcRequisite реквизит банковского счёта, с
     *                     которого перечисляются деньги
     * @param destPassport номер паспорта пользователя счёта,
     *                     на который перечисляются деньги
     * @param destRequisite реквизит банковского счёта, на
     *                      который перечисляются деньги
     * @param amount перечисляемая сумма денег
     * @return true при успешном выполнении операции или false,
     * если не найдены пользователи с передаваемыми номерами паспортов
     * и багковские счёта с передаваемыми реквизитами
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount != null && amount <= srcAccount.getBalance()) {
            Account destAccount = findByRequisite(destPassport, destRequisite);
            if (destAccount != null) {
                destAccount.setBalance(amount + destAccount.getBalance());
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                result = true;
            }
        }
        return result;
    }
}
