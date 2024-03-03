package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void setPassengers(int passengers);

    double refuel(double fuelAmount);
}
