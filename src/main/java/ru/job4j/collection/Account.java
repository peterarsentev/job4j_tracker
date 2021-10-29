package ru.job4j.collection;

import java.util.Objects;

public class Account {
    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(passport, account.passport) && Objects.equals(username, account.username) && Objects.equals(deposit, account.deposit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport, username, deposit);
    }

    @Override
    public String toString() {
        return "Account{" +
                "passport='" + passport + '\'' +
                ", username='" + username + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }
}
