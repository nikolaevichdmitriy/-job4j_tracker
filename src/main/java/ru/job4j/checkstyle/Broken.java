package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private String surname;
    private String name;

    public static final String NEW_VALUE = "New Value";

    void echo() {

    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    public Broken() {

    }

    public int getSizeOfEmpty() {
        return sizeOfEmpty;
    }

    public void setSizeOfEmpty(int sizeOfEmpty) {
        this.sizeOfEmpty = sizeOfEmpty;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
