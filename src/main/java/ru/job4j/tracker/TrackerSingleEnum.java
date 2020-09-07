package ru.job4j.tracker;

public enum TrackerSingleEnum {
    SINGLE_ENUM;
    // Конструкторы и методы.
    private Tracker tracker = new Tracker();

    public Item add(Item model) {
        return model;
    }

    public Tracker showTracker() {
        return this.tracker;
    }

}
