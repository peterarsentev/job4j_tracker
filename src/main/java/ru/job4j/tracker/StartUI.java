package ru.job4j.tracker;

public class StartUI {


    public static void main(String[] args) {
        Item item = new Item("box", 50);
        Tracker tracker = new Tracker();
        System.out.println(item.toString() + " " + tracker.add(item) + " " + tracker.findById(1));
    }
}
