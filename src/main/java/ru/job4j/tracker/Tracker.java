package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        for (int index = 0; index < rsl.length; index++) {
            if (items[index] != null) {
                rsl[index] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                rsl[index] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item findByld(int id) {
        Item[] rsl = new Item[items.length];
        for (int index = 0; index < rsl.length; index++) {
            if (items[index].getId() == id) {
                return items[index];
            }
        }
        return null;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}