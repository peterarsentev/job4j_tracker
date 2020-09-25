package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return users.keySet().stream()
                .filter(e -> e.getPassport()
                        .equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
           return users.get(user).stream()
                    .filter(e -> e
                            .getRequisite()
                            .equals(requisite))
                    .findFirst()
                   .orElse(null);

        }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User found = findByPassport(srcPassport);
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if ((found != null) && (account != null) && (account.getBalance() >= amount)) {
            account.setBalance(account.getBalance() - amount);
            accountDest.setBalance(accountDest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}