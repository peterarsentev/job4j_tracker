package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private String generateId() {
        Random num = new Random();
        return String.valueOf(num.nextLong() + System.currentTimeMillis());

    }

    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        System.out.println(item);
        return item;
    }

    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findByName(String name){
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll(){
        Item[] itemsWithoutNull = new Item[size];
        int size1 = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size1] = item;
                size1++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }
}