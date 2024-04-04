package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private String surname;
    private String name;
    private static final String NEW_VALUE = "New Value";

    public Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
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