package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanov@yandex.ru", "Petr Ivanov");
        map.put("parsent@yandex.ru", "Ivan Arsentev");
        map.put("arshavin@yandex.ru", "Max Arshavin");
        map.put("bistrov@yandex.ru", "Pep Bistrov");
        map.put("bistrov@yandex.ru", "Pep Bistrov");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ",Name: " + map.get(key));
        }
    }
}
