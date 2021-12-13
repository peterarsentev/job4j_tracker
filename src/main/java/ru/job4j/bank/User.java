package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банковской системы
 * Модель содержит поля: пасспорт и имя пользователя
 * @author Veronika Lapenok
 */
public class User {
    /**
     * Поле типа String хранит паспорт пользователя
     */
    private String passport;
    /**
     * Поле типа String хранит имя пользователя
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для паспорта
     * @return номер паспорта пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для номера паспорта
     * @param passport - номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для имени пользователя
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для имени пользователя
     * @param username - имя пользователя
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
