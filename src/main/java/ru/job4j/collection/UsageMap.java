package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentey@yandex.ru", "Pet Arsentev");
        map.put("parsenteb@yandex.ru", "Petya Arsentev");
        map.put("parsenter@yandex.ru", "Petr Arsentev");
        map.put("parsenten@yandex.ru", "Pepe Arsentev");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ",Name: " + map.get(key));
        }
    }
}
