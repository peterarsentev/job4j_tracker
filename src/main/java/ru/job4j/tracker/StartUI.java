package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item time = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = time.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
        Tracker track = new Tracker();
        Item item = new Item();
        Item findItem = track.add(item);
        int temp = 5;
        Item findId = track.findById(temp);
        System.out.println(findId);
    }
}
