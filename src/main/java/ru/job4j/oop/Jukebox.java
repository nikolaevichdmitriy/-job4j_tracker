package ru.job4j.oop;

public class Jukebox {
    public void music(int position){
        switch (position){
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");
                break;
        }
    }
    public static void main(String[] args) {
        Jukebox Ivan = new Jukebox();
        Ivan.music(1);
        Ivan.music(2);
        Ivan.music(3);
    }
}
