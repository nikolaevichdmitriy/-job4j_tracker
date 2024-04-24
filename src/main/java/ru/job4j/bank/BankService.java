package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            Account existingAccount = findByRequisite(passport, account.getRequisite());
            if (existingAccount == null) {
                getAccounts(user).add(account);
            } else {
                System.out.println("Счет с такими же реквизитами уже существует.");
            }
        } else {
            System.out.println("Пользователь не найден.");
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account existingAccount : getAccounts(user)) {
                if (existingAccount.getRequisite().equals(requisite)) {
                    return existingAccount;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        if (sourceAccount == null) {
            return false;
        }
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (destinationAccount == null) {
            return false;
        }
        if (sourceAccount.getBalance() < amount) {
            return false;
        }
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        return true;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
