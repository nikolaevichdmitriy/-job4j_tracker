package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int x, int left, int right) {
        return max(max(x, left), right);
    }

    public static int max(int x, int left, int z, int right) {
        return max(max(x, left), max(z, right));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(12, 11));
        System.out.println(Max.max(24, 50, 12));
        System.out.println(Max.max(12, 34, 76, 3));
    }
}
