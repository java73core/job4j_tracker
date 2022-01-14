package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();
    private List<Account> listAccount = new ArrayList<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, null);
        }
    }

    public void addAccount(String passport, Account account) {
        User newUser = findByPassport(passport);
        if (newUser != null) {
            listAccount.add(account);
            users.putIfAbsent(newUser,listAccount);
        }
    }

    public User findByPassport(String passport) {
        for (User searchUser: users.keySet()) {
            if (searchUser.getPassport().equals(passport)) {
                return searchUser;
            }
        }
        return null;
    }

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

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account AccFirst = findByRequisite(srcPassport, srcRequisite);
        Account AccSecond = findByRequisite(destPassport, destRequisite);
        if(AccFirst == null || AccFirst.getBalance() < amount) {
            return rsl;
        } else {
            AccSecond.setBalance(AccSecond.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}