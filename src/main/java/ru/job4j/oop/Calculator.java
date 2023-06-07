package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int q) {
        return q / x;
    }

    public int sumAllOperation(int x) {
        this.x = x;
        return sum(2) + minus(4) + divide(1) + multiply(9);
    }

    public static int minus(int z) {
        return z - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int amount = calculator.sumAllOperation(24);
        System.out.println(amount);
        System.out.println(minus(3));
        int result = calculator.divide(7);
        System.out.println(result);
    }
}
