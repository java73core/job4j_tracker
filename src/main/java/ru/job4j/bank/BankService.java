package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static javax.swing.UIManager.get;

/**
 * Класс описывает функционал банковских операций
 * @author ANDREY MIRONOV
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение задания осуществляется в переменной типа Map
     * Где ключом является пользователь, а значением список возможных счетов
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Введён дополнительный список типа ArrayList
     * для упрощения работы с переменной типа Map
     */
    private List<Account> accounts = new ArrayList<>();

    /**
     * Метод добавляет пользователья в Map
     * @param user пользователь, который добавляется в карту
     */
    public void addUser(User user) {
       users.putIfAbsent(user, accounts);
    }

    /**
     * Метод добавляет номер счёта (Account) к пользователю
     * @param passport данные номера паспотра, по которым определяется пользователь
     * @param account аккаунт, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод, который ищет в карте пользователя по данным номера пасторта
     * @param passport номер паспотра
     * @return возвращает пользователя, либо null, если он не найден
     */
    public User findByPassport(String passport) {
        for (User searchUser: users.keySet()) {
            if (searchUser.getPassport().equals(passport)) {
                return searchUser;
            }
        }
        return null;
    }

    /**
     * Метод, который возвращает аккаунт пользователя по входным параметрам
     * @param passport номер паспорта
     * @param requisite номер счёта
     * @return возвращает аккаунт пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        User person = findByPassport(passport);
        if (person != null) {
            List<Account> listAccount = users.get(person);
            for (Account account : listAccount) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод реализующий перевод средств со счёта на счёт
     * @param srcPassport номер паспорта пользователя который переводит
     * @param srcRequisite номер счёта пользователя с которого проводится перевод
     * @param destPassport номер паспорта получателя перевода
     * @param destRequisite номер счёта получателя
     * @param amount сумма перевода
     * @return результат перевода. Выполнен или нет.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accFirst = findByRequisite(srcPassport, srcRequisite);
        Account accSecond = findByRequisite(destPassport, destRequisite);
        if (accFirst != null && accSecond != null && accFirst.getBalance() >= amount) {
            accFirst.setBalance(accFirst.getBalance() - amount);
            accSecond.setBalance(accSecond.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}