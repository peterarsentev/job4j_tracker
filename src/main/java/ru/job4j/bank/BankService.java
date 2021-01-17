package ru.job4j.bank;

import ru.job4j.collection.PassportOffice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        if (!users.get(findByPassport(passport)).contains(account)) {
            users.get(findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User u : users.keySet()) {
            if (u.getPassport().equals(passport)) {
                return u;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = users.get(findByPassport(passport));
        if (accounts == null) {
            return null;
        }
        for (Account acc : accounts) {
            if (acc.getRequisite().contains(requisite)) {
                return acc;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null || srcAcc.getBalance() >= amount) {
            findByRequisite(destPassport, destRequisite).setBalance(destAcc.getBalance() + amount);
            findByRequisite(srcPassport, srcRequisite).setBalance(srcAcc.getBalance() - amount);
            return true;

        }
        return false;
    }
}
