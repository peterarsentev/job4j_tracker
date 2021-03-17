package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                List<Account> accounts = users.get(user);
                if (!accounts.contains(account)) {
                    accounts.add(account);
                }
                users.putIfAbsent(user, accounts);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = null;
        Account destAccount = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(srcPassport)) {
                List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(srcRequisite)) {
                        srcAccount = account;
                    }
                }
            }
            if (user.getPassport().equals(destPassport)) {
                List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(destRequisite)) {
                        destAccount = account;
                    }
                }
            }
        }
        boolean transferMoney = srcAccount.getBalance() >= amount;
        if (transferMoney) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        if (srcAccount != null && destAccount != null && transferMoney) {
            addAccount(srcPassport, srcAccount);
            addAccount(destPassport, destAccount);
            rsl = true;
        }
        return rsl;
    }
}
