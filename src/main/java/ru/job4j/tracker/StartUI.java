package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item one = new Item();
        LocalDateTime currentDateTime = one.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
