package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item time = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = time.getCreated().format(formatter);
        //String currentDateTimeFormat = time.created.format(formatter); // какой вариант правильный, этот или верхний?
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

    }
}
