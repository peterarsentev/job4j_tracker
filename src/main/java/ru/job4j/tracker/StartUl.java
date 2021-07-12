package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUl {
    public static void main(String[] args) {
        Item dataToday = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = dataToday.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        Item objectOut = new Item();
        System.out.println(objectOut);
    }
}