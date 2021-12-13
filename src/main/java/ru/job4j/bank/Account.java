package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счёта.
 * Модель содержит поля: баланс и реквизит
 * @author Veronika Lapenok
 */
public class Account {
    /**
     * Поле типа String хранит реквизит банковского счёта
     */
    private String requisite;
    /**
     * Поле типа double хранит баланс банковского счёта
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для реквизита
     * @return реквизит банковского счёта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для реквизита
     * @param requisite реквизит банковского счёта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для баланса
     * @return баланс банковского счёта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для баланса
     * @param balance баланс банковского счёта
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
