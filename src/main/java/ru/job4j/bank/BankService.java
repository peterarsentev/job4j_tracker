package ru.job4j.bank;
import java.util.*;

/**
 * Этот класс описывает работу банковской системы, у которой есть функции:
 *  1.Регистрировать новых пользователей.
 *  2.Открывать клиенту новый банковский счет.
 *  3.Переводить деньги между банковскими счетами.
 * @author Nikolaev Dmitriy.
 * @version 1.0
 */
public class BankService {
    /**
     * Информация о клиентах хранится в коллекции типа HashMap.
      */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и если его ещё нет в системе,
     * добавляет его.
     * @param user пользователь(клиент)
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает паспортные данные и банковский счет.
     * Если пользователь уже есть в системе, а счета у него нет,
     * то добавляет ему новый банковский счет.
     * @param passport паспортные данные.
     * @param account банковсчкий счет.
     */
    public void addAccount(String passport, Account account) {
        User pass = findByPassport(passport);
        if (pass != null) {
            List<Account> accounts = users.get(pass);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспортным данным.
     * @param passport паспортные данные.
     * @return null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет пользователя по паспортным данным,
     * и банковский счет по реквизитам.
     * @param passport паспортные данные.
     * @param requisite реквизиты банковского счета.
     * @return null, если если счет не найден.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }

        return rsl;
    }

    /**
     * Метод переводит баланс с одного банковского счета на другой.
     * Усли баланс меньше суммы перевода или счет не найден, возвращает false.
     * @param srcPassport данные паспорта с которго списывают баланс.
     * @param srcRequisite реквизиты, с которого списывают баланс.
     * @param destPassport данные паспорта кому пополняют баланс.
     * @param destRequisite реквизиты счета где пополняют баланс.
     * @param amount сумма перевода.
     * @return false если перевод не выполнен.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (source != null && dest != null && source.getBalance() >= amount) {
                source.setBalance(source.getBalance() - amount);
                dest.setBalance(dest.getBalance() + amount);
                rsl = true;
            }
        return rsl;
    }
}