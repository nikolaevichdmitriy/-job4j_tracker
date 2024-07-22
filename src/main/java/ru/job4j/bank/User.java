package ru.job4j.bank;

import java.util.Objects;
/**
 * Класс {@code User} представляет пользователя в системе, содержащий уникальный паспорт и имя пользователя.
 */

public class User {
    /**
     * Уникальный идентификатор пользователя, обычно представляющий номер паспорта.
     */
    private String passport;
    /**
     * Имя пользователя, которое может быть выбрано самим пользователем.
     */
    private String username;
    /**
     * Конструктор класса {@code User}, принимающий уникальный паспорт и имя пользователя.
     *
     * @param passport Уникальный идентификатор пользователя.
     * @param username Имя пользователя.
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }
    /**
     * Возвращает уникальный идентификатор пользователя.
     *
     * @return Уникальный идентификатор пользователя.
     */

    public String getPassport() {
        return passport;
    }
    /**
     * Устанавливает новый уникальный идентификатор пользователя.
     *
     * @param passport Новый уникальный идентификатор пользователя.
     */

    public void setPassport(String passport) {
        this.passport = passport;
    }
    /**
     * Возвращает имя пользователя.
     *
     * @return Имя пользователя.
     */

    public String getUsername() {
        return username;
    }
    /**
     * Устанавливает новое имя пользователя.
     *
     * @param username Новое имя пользователя.
     */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Переопределенный метод {@link Object#equals(Object)} для сравнения двух объектов {@code User}.
     * Два объекта считаются равными, если их паспорта совпадают.
     *
     * @param o Объект для сравнения.
     * @return {@code true}, если паспорта объектов совпадают, иначе {@code false}.
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
     * Переопределенный метод {@link Object#toString()} для форматированного вывода информации о пользователе.
     *
     * @return Строка, содержащая информацию о пользователе.
     */

    @Override
    public String toString() {
        return "User{" + "passport='" + passport + '\'' + ", username='" + username + '\'' + '}';
    }
    /**
     * Переопределенный метод {@link Object#hashCode()} для получения хеш-кода объекта {@code User},
     * основанного на его паспорте.
     *
     * @return Хеш-код объекта {@code User}.
     */

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
