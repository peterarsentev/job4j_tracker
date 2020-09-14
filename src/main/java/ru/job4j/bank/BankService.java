package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User found = findByPassport(passport);
        if ((found != null) && (!users.get(found).contains(account))) {
            users.get(found).add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) rsl = user;
            break;
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        for (Account account : users.get(user)) {
            if (account.getRequisite().equals(requisite)) rsl = account;
            break;
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User found = findByPassport(srcPassport);
        Account account = findByRequisite(srcPassport, srcRequisite);
        if ((found != null) && (account != null) && (account.getBalance() >= amount)) {
            account.setBalance(account.getBalance() - amount);
            findByRequisite(destPassport, destRequisite).setBalance(account.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}