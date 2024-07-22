package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс {@code Account} представляет собой банковский счет, имеющий уникальный реквизит и баланс.
 * Реквизит используется для идентификации счета, а баланс отражает текущее состояние счета.
 */

public class Account {
    /**
     * Уникальный идентификатор счета, например, номер счета.
     */
    private String requisite;
    /**
     * Текущий баланс на счете.
     */
    private double balance;

    /**
     * Конструктор класса {@code Account}, принимающий уникальный реквизит и начальную сумму баланса.
     *
     * @param requisite Уникальный идентификатор счета.
     * @param balance Начальная сумма баланса на счете.
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }
    /**
     * Возвращает уникальный идентификатор счета.
     *
     * @return Уникальный идентификатор счета.
     */

    public String getRequisite() {
        return requisite;
    }
    /**
     * Устанавливает новый уникальный идентификатор счета.
     *
     * @param requisite Новый уникальный идентификатор счета.
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }
    /**
     * Возвращает текущую сумму баланса на счете.
     *
     * @return Текущая сумма баланса на счете.
     */

    public double getBalance() {
        return balance;
    }
    /**
     * Устанавливает новую сумму баланса на счете.
     *
     * @param balance Новая сумма баланса на счете.
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Переопределенный метод {@link Object#equals(Object)} для сравнения двух объектов {@code Account}.
     * Два объекта считаются равными, если их реквизиты совпадают.
     *
     * @param o Объект для сравнения.
     * @return {@code true}, если реквизиты объектов совпадают, иначе {@code false}.
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
     * Переопределенный метод {@link Object#hashCode()} для получения хеш-кода объекта {@code Account},
     * основанного на его реквизите.
     *
     * @return Хеш-код объекта {@code Account}.
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
