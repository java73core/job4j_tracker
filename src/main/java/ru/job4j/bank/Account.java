package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных Account
 * @author ANDREY MIRONOV
 * @version 1.0
 */
public class Account {

    /**
     * Определены две переменные
     * requisite - номер счёта
     * balance - баланс счёта
     */
    private String requisite;
    private double balance;

    /**
     * Определён конструктор с двумя входными параметрами
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Определён геттер
     * @return номер счёта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Определён сеттер
     * @param requisite задающий номер счёта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Определён геттер
     * @return баланс счёта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Определён сеттер
     * @param balance баланс счёта
     */
    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределён hashCode
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}