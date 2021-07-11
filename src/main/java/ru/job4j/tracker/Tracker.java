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
        Item[] itemWithOutNull = new Item[size];
        int number = 0;
        for (int index = 0; index < size; index++) {
            Item completed = items[index];
            if (completed != null) {
                itemWithOutNull[number] = completed;
                number++;
            }
        }
        itemWithOutNull = Arrays.copyOf(itemWithOutNull, number);
        return itemWithOutNull;
    }

    public Item[] findByName(String kay) {
        Item[] searchName = new Item[size];
        int number = 0;
        for (int index = 0; index < size; index++) {
            Item coincide = items[index];
            if (coincide.getName().equals(kay)) {
                searchName[number] = items[index];
                number++;
            }
        }
        searchName = Arrays.copyOf(searchName, number);
        return searchName;
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