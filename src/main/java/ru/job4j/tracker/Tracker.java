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

    public Item[] findAll(){
        Item[] found = new Item[items.length];
        found = Arrays.copyOf(found, size);
        return found;
    }

    public Item[] findByName(String key){
        Item[] found = new Item[items.length];
        int num = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                found[num] = item;
                num += 1;
            }
        }
        found = Arrays.copyOf(found, size);
        return found;
    }
}