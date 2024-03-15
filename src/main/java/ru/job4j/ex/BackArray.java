package ru.job4j.ex;

public class BackArray {
    public String[] turn(String[] names) {
        if (names == null) {
            return null;
        }
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - 1 - index];
            names[names.length - 1 - index] = temp;

        }
        return names;
    }
}
