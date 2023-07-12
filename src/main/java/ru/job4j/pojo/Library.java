package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Part one", 127);
        Book bookTwo = new Book("Part two", 300);
        Book bookTree = new Book("Part tree", 200);
        Book bookFour = new Book("Clean code", 150);
        Book[] books = {bookOne, bookTwo, bookTree, bookFour};

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(String.format("[%d] %s - %s ", index, book.getName(), book.getNumber()));
        }
        System.out.println("Переставьте местами книги с индексом 0 и 3");

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(String.format("[%d] %s - %s ", index, book.getName(), book.getNumber()));
        }
        System.out.println("Добавьте цикл с выводом книг с именем" + "   " + bookFour.getName());
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(String.format("[%d] %s - %s ", index, book.getName(), book.getNumber()));
            }
        }
    }
}
