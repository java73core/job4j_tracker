package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных User
 * @author ANDREY MIRONOV
 * @version 1.0
 */
public class User {

    /**
     * Определены две переменные
     * passport - номер паспорта
     * username - имя пользователя
     */
    private String passport;
    private String username;

    /**
     * Определён конструктор с двумя входными параметрами
     * @param passport
     * @param username
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Определён геттер
     * @return номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Определён сеттер
     * @param passport номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Определён геттер
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Определён сеттер
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределён equals
     * @param o
     * @return true or false
     */
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

    /**
     * Переопределён hashCode
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}