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

    public Item[] findAll() {
        Item[] notNullItems = new Item[items.length];
        size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                notNullItems[size] = item;
                size++;
            }
        }
        notNullItems = Arrays.copyOf(notNullItems, size);
        return notNullItems;
    }

    public Item[] findByName(String key) {
        Item[] notNullItems = findAll();
        Item[] searchingByNameItems = new Item[notNullItems.length];
        int count = 0;
        for (int index = 0; index < notNullItems.length; index++) {
            Item item = notNullItems[index];
            if (key.equals(item.getName())) {
                searchingByNameItems[count] = item;
                count++;
            }
        }
        searchingByNameItems = Arrays.copyOf(searchingByNameItems, count);
        return searchingByNameItems;
    }
}