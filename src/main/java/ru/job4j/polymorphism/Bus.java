package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус движется");

    }

    @Override
    public void setPassengers(int passengers) {
        System.out.println("Установлено количество пассажиров: " + passengers);
    }

    @Override
    public double refuel(double fuelAmount) {
        double price = fuelAmount * 10.0;
        System.out.println("Цена заправки: " + price);
        return price;
    }
}
