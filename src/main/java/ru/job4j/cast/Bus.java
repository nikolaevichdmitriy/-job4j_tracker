package ru.job4j.cast;

public class Bus  implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Я умею ездить только  по дороге");

    }
}
