package ru.job4j.tracker;

public class TrackerSingleGet {
    private static TrackerSingleGet instance;

    private TrackerSingleGet() {
    }

    public static TrackerSingleGet getInstance() {
        if (instance == null) {
            instance = new TrackerSingleGet();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
