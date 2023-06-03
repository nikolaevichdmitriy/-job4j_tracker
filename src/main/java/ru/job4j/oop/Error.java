package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(message);
        System.out.println(status);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 2, "error");
        error.printInfo();
        Error err = new Error();
        err.printInfo();
    }
}
