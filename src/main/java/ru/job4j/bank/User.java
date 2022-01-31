package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка.
 * Эта модель содержит поля: номер паспорта и ФИО
 */
public class User {
    private String passport;
    private String username;

    /**
     * @param passport - паспорт пользователя
     * @param username - имя пользоватлея
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает
     * @return паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /** Метод устанавливает новое значение
     * паспорт пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод устанавливает новое значение имени пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
