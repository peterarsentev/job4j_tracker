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
        Item[] nameWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                nameWithoutNull[size] = item;
                size++;
            }
        }
        nameWithoutNull = Arrays.copyOf(nameWithoutNull, size);
        for (int index = 0; index < nameWithoutNull.length; index++) {
        }
        return nameWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] name = new Item[size];
        int id = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                name[id] = item;
                id++;
            }
        }
        return Arrays.copyOf(name, id);

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