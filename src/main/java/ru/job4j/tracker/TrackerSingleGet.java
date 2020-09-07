package ru.job4j.tracker;

public class TrackerSingleGet {
    private static Tracker instance;

    private TrackerSingleGet() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
