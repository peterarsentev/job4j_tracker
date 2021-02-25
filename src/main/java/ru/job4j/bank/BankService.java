package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской базы данных пользователей и списоков аккаунтов
 * пользователей
 *
 * @author job4j.ru
 * @version 1.0
 */
public class BankService {
    /**
     * Хранилище пользователей в коллекции типа HashMap и списки их аккаунтов в коллекции
     * типа ArrayList.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет в коллекцию HashMap пользователя как ключ и создает список
     * аккаунтов пользователя
     * ArrayList, добавляет его как значение.
     *
     * @param user пользователь, который добавляется в хранилище
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод находит пользователя по данным паспорта, добавляет в список аккаунтов
     * пользователя новый аккаунт
     *
     * @param passport значение переменной по данным которой производится поиск
     *                 пользователя
     * @param account  аккаунт, который добавляется в список аккаунта найденного
     *                 пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Метод производит поиск пользователя по данным паспорта
     *
     * @param passport значение переменной по данным которой производится поиск пользователя
     * @return возвращает найденного пользователя
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод производит поиск пользователя в хранилище по данным паспорта,
     * а так же производит поиск аккаунта по реквизитам
     *
     * @param passport  значение переменной по данным которой производится
     *                  поиск пользователя
     * @param requisite значение переменной по данным которой производится
     *                  поиск аккаунта найденного пользователя
     * @return возвращает найденный аккаунт пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst());

    }

    /**
     * Метод производит трансфер финансовых средств из аккаунта одного пользователя
     * в аккаунт другого.
     *
     * @param srcPassport   значение переменной по данным которой производится поиск
     *                      пользователя отправителя
     * @param srcRequisite  значение переменной по данным которой производится поиск
     *                      аккаунта отправителя
     * @param destPassport  значение переменной по данным которой производится поиск
     *                      пользователя получателя
     * @param destRequisite значение переменной по данным которой производится поиск
     *                      аккаунта получателя
     * @param amount        величина передаваемых денежных средств
     * @return возвращается результат работы метода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> srcAcc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc.isPresent() && destAcc.isPresent() && srcAcc.get().getBalance() >= amount) {
            findByRequisite(destPassport, destRequisite).get().setBalance(destAcc.get().getBalance() + amount);
            findByRequisite(srcPassport, srcRequisite).get().setBalance(srcAcc.get().getBalance() - amount);
            return true;
        }
        return false;
    }
}
