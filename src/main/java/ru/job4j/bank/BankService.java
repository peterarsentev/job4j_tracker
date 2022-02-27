package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает простейшую модель взаимодействия с пользователями
 * банковской системы и с привязанными к ним счетами
 */
public class BankService {
    /**
     * Хранение всех пользователей осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя
     * По умолчанию к нему добавляется пустой список его счетов new ArrayList
     * В методе есть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то новый не добавляется.
     * @param user пользователь который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     * @param passport по паспорту ищется уникальный пользователь
     * @param account описнаие добавляемого счета
     */
    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport - является уникальным в системе
     * @return возвращает пользователя или null если пользователь не найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport - паспорт пользоватлея
     * @param requisite - реквизиты счета
     * @return возвращает пользователя или null если пользователь не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * @param srcPassport  - паспорт отправителя
     * @param srcRequisite - счет отправителя
     * @param destPassport - паспорт получателя
     * @param destRequisite - счет получаетля
     * @param amount - сумма перевода
     * @return в случае успешного перевода возвращает true,
     * если счёт не найден или не хватает денег на счёте отправителя, то метод возвращает false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null
                && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);

            return true;
        }
        return false;
    }
}
