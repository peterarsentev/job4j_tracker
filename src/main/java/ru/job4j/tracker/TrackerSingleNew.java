package ru.job4j.tracker;

public class TrackerSingleNew {
    private TrackerSingleNew() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingleNew.getInstance();
    }
}
