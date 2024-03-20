package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        System.out.println("Вывод содержимого коллекции после добавления:");
        for (String string : arrayList) {
            System.out.println(string);
        }
    }
}
