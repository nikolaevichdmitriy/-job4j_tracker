package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Will it rain tomorrow? ");
        String s = input.nextLine();
        int ran = new Random().nextInt(3);
        String answer = switch (ran) {
            case 1 -> ("Yes");
            case 2 -> ("No");
            default -> ("Don't know");
        };
        System.out.println(answer);
    }
}
