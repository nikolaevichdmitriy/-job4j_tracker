package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int q) {
        return q / x;
    }

    public int sumAllOperation() {
        return sum(5) + minus(4) + divide(1) + multiply(9);
    }

    public static int minus(int z) {
        return z - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int suma = calculator.sumAllOperation();
        System.out.println(suma);
        System.out.println(minus(3));
        int rez = calculator.divide(7);
        System.out.println(rez);
    }
}
