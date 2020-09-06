package ru.job4j.tracker;

public class TrackerSingleNew {
    private TrackerSingleNew() {
    }

    public static TrackerSingleNew getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleNew INSTANCE = new TrackerSingleNew();
    }

    public static void main(String[] args) {
        TrackerSingleNew tracker = TrackerSingleNew.getInstance();
    }
}
