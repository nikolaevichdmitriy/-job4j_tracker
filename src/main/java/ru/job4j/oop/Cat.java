package ru.job4j.oop;

public class Cat {

    private String food;
    private  String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        System.out.println("There are black's food.");
        System.out.println("There are  black's nick.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("boss");
        black.show();
    }
}


