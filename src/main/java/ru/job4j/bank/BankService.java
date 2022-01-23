package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Это поле private final Map<User, List<Account>> users = new HashMap<>();
 содержит всех пользователей системы с привязанными к ним счетами

 addUser - добавляет пользователя в систему
 addAccount - добавляет новый счет к пользователю
 findByPassport - ищет пользователя по номеру паспорта
 findByRequisite - ищет счет пользователя по реквизитам
 transferMoney - предназначен для перечисления денег с одного счёта на другой счёт


*/

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        ArrayList<Account> userAccounts = (ArrayList<Account>) users.get(user);
        if (!userAccounts.contains(account)) {
            userAccounts.add(account);
            users.put(user, userAccounts);
        }
    }

    public User findByPassport(String passport) {
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            ArrayList<Account> userAccounts = (ArrayList<Account>) users.get(user);
            for (Account account : userAccounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, srcRequisite);
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
