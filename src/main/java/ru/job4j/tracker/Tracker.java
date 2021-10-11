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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replaceт(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index].setName(item.getName());
            return true;
        }
        return false;
    }




}