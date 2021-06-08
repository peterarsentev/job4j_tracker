package ru.job4j.bank;

import java.util.*;

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
        Optional<User> key = findByPassport(passport);
        if (key.isPresent()) {
            List<Account> accounts = users.get(key.get());
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(key -> key.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет аккаунта по реквизитам
     *
     * @param passport  паспорт пользователя
     * @param requisite реквизиты пользователя
     * @return возвращает аккаунт, если его нет в системе возвращает null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            rsl = users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return rsl;
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent()
                && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
