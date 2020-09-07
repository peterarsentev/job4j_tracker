package ru.job4j.tracker;

public class TrackerSingle {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingle() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
    }
}

