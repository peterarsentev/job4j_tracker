package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user: users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount != null && amount <= srcAccount.getBalance()) {
            Account destAccount = findByRequisite(destPassport, destRequisite);
            if (destAccount != null) {
                destAccount.setBalance(amount + destAccount.getBalance());
                result = true;
            }
        }
        return result;
    }
}
