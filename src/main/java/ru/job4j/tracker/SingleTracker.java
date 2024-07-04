package ru.job4j.tracker;

public class SingleTracker {

    private static SingleTracker instance;

    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    private static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }
}
