package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;
/**
 * Класс {@code BankService} предоставляет сервисные функции для управления пользователями и их счетами в банке.
 * Он поддерживает добавление пользователей и счетов, удаление пользователей и поиск пользователей и счетов
 * по различным критериям.
 */
public class BankService {
    /**
     * Содержит карту пользователей и их список счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();
    /**
     * Добавляет нового пользователя в систему, если такого пользователя еще нет.
     *
     * @param user Пользователь для добавления.
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }
    /**
     * Удаляет пользователя из системы по паспорту.
     *
     * @param passport Паспорт пользователя для удаления.
     */

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }
    /**
     * Добавляет счет пользователя в системе.
     *
     * @param passport Паспорт пользователя, которому принадлежит счет.
     * @param account Счет для добавления.
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }
    /**
     * Ищет пользователя по паспорту.
     *
     * @param passport Паспорт пользователя для поиска.
     * @return Пользователь, если найден, иначе {@code null}.
     */

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }
    /**
     * Ищет счет пользователя по реквизиту.
     *
     * @param passport Паспорт пользователя, чей счет ищется.
     * @param requisite Реквизит счета для поиска.
     * @return Счет, если найден, иначе {@code null}.
     */

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
    /**
     * Переводит деньги между двумя счетами.
     *
     * @param sourcePassport Паспорт отправителя.
     * @param sourceRequisite Реквизит счета отправителя.
     * @param destinationPassport Паспорт получателя.
     * @param destinationRequisite Реквизит счета получателя.
     * @param amount Сумма для перевода.
     * @return {@code true}, если перевод выполнен успешно, иначе {@code false}.
     */

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
    /**
     * Возвращает список всех счетов пользователя.
     *
     * @param user Пользователь, чьи счета нужно получить.
     * @return Список счетов пользователя.
     */

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
