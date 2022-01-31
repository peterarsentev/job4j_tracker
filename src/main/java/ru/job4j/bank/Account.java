package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета.
 * Эта модель содержит поля: баланс и реквизиты
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * @param requisite - реквезиты счета
     * @param balance - баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * метод возвращает
     * @return реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * метод записыывает новые
     * @param requisite - реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * метод возвращает
     * @return баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * метод записыывает новое значение
     * @param balance баланса счета
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
