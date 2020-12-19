package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(formatter));

        Tracker tracker = new Tracker();
        item.setName("name1");
        tracker.add(item);
        System.out.println(tracker.findById(1).getName());

//        9. toString [#409238]
        Item item1 = new Item();
        item1.setName("itemToString");
        item1.setId(34);
        System.out.println(item1.toString());
    }
}