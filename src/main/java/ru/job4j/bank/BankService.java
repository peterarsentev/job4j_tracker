package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс котоорый описывает банковский сервис
 *
 * @author Polyanskiy Dmitriy
 * @version 1.0
 */
public class BankService {
    /**
     * Хранилище всех пользователей и их счетов
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод который добавляет пользователей в хранилище
     *
     * @param user пользователь который добавляется в хранилище
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счета пользователя
     *
     * @param passport пасспорт пользователя
     * @param account  аккаутн
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
     * Метод ищет пользователя по паспорту
     *
     * @param passport паспорт пользователя
     * @return возвращает пользователя или null если пользователя нет в системе
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет аккаунта по реквизитам
     *
     * @param passport  паспорт пользователя
     * @param requisite реквизиты пользователя
     * @return возвращает аккаунт, если его нет в системе возвращает null
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
     * Метод переводит деньги с одного счета на другой
     *
     * @param srcPassport   паспорт пользователя со счета которого осуществляется перевод
     * @param srcRequisite  реквизиты пользователя со счета которого осуществляется перевод
     * @param destPassport  паспорт пользователя на счет которого осуществляется перевод
     * @param destRequisite реквизиты пользователя на счет которого осуществляется перевод
     * @param amount        сумма перевода
     * @return возвращает true если перевод был успешным или false если перевод не состоялся
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
