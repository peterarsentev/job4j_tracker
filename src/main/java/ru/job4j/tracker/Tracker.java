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

    public Item[] findAll(){
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item v = items[index];
            if (v != null) {
                namesWithoutNull[size] = v;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        return namesWithoutNull;

    }

    public Item[] findByName(String key){
        Item[] newMass = new Item[size];
        int s = 0;
        for (int index = 0; index < size; index++) {
            String nameNewItem = items[index].getName();
            if (nameNewItem != null && nameNewItem.equals(key)) {
                newMass[s] = items[index];
                s++;
            }
        }
        newMass = Arrays.copyOf(newMass, s);
        return newMass;
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