package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        System.out.println("Car brands:");
        autos.add(" Lada");
        autos.add(" BMW");
        autos.add(" Volvo");
        autos.add(" Toyota");
        System.out.println(autos);
    }
}
