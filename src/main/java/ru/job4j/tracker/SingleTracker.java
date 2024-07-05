package ru.job4j.tracker;

import java.util.Arrays;

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
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return null;
    }

    public Item[] findByName(String key) {
        return null;

    }

    private int indexOf(int id) {
        int result = -1;
        return result;
    }

    public boolean replace(int id, Item item) {
        return false;
    }

    public boolean delete(int id) {
        return false;
    }
}

