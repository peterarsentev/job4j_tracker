package ru.job4j.tracker;

public class TrackerSingle2 {

    private static Tracker instance;
    private TrackerSingle2() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

}
