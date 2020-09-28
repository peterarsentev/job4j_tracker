package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        Optional<User> found = findByPassport(passport);
        if ((found.isPresent()) && (!users.get(found.get()).contains(account))) {
            users.get(found.get()).add(account);
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(e -> e.getPassport()
                        .equals(passport))
                .findFirst();
    }


    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get()).stream()
                     .filter(e -> e
                             .getRequisite()
                             .equals(requisite))
                     .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<User> found = findByPassport(srcPassport);
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if ((found.isPresent()) && (account != null) && (account.getBalance() >= amount)) {
            account.setBalance(account.getBalance() - amount);
            accountDest.setBalance(accountDest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}