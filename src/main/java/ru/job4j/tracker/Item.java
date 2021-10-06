package ru.job4j.tracker;
import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;

    public  Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(double id, String name) {
        this.id = (int) id;
        this.name = name;
    }
}