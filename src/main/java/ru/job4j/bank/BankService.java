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
        Optional<User> pass = findByPassport(passport);
        if (pass.isPresent()) {
            List<Account> accounts = users.get(pass.get());
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();

    }

    /**
     * Метод ищет пользователя по паспортным данным,
     * и банковский счет по реквизитам.
     * @param passport паспортные данные.
     * @param requisite реквизиты банковского счета.
     * @return null, если если счет не найден.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(u -> users.get(u)
                .stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst());

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
        Optional<Account> source = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (source.isPresent() && dest.isPresent() && source.get().getBalance() >= amount) {
                source.get().setBalance(source.get().getBalance() - amount);
                dest.get().setBalance(dest.get().getBalance() + amount);
                rsl = true;
            }
        return rsl;
    }
}