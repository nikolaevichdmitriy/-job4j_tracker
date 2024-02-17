package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(12, "Mask");
        System.out.println(item.getCreated().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        Item item1 = new Item(10, "Say");
        System.out.println(item1.toString());
    }
}
