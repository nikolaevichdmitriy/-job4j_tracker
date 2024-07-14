package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String name = "";
        int number = 1;
        for (int i = 0; i < queue.size(); ) {
            if (number == count) {
                name = queue.element().name();
                break;
            }
            queue.poll();
            number++;
        }

        return name;
    }

    public String getFirstUpsetCustomer() {
        String name = "";
        int number = 1;
        for (int i = 0; i < queue.size(); ) {
            if (number > count) {
                name = queue.element().name();
                break;
            }
            queue.poll();
            number++;
        }
        return name;
    }
}
