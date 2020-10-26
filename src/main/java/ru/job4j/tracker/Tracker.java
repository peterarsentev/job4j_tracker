package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public void add(Item item) {
        item.setId(ids++);
        items[size++] = item;
    }

    public Item[] findAll(){
        int size = 0;
        Item[] itemsWithoutNull = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key){
        int size = 0;
        Item[] itemsNames = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                itemsNames[index] = item;
                size++;
            }
        }
        itemsNames = Arrays.copyOf(itemsNames, size);
        return itemsNames;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
