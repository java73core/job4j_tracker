package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            accounts = users.get(user.get());
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(key -> key.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод, который возвращает аккаунт пользователя по входным параметрам
     * @param passport номер паспорта
     * @param requisite номер счёта
     * @return возвращает аккаунт пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> person = findByPassport(passport);
        if (person.isPresent()) {
            return person.flatMap(user -> Optional.of(users.get(user)
                            .stream()
                            .filter(a -> a.getRequisite().equals(requisite))
                            .findFirst())
                            .orElse(Optional.empty()));
        }
        return Optional.empty();
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
        Optional<Account> accFirst = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accSecond = findByRequisite(destPassport, destRequisite);
        if (accFirst.isPresent()
                && accSecond.isPresent()
                && accFirst.get().getBalance()
                >= amount) {
            accFirst.get().setBalance(accFirst.get().getBalance() - amount);
            accSecond.get().setBalance(accSecond.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}