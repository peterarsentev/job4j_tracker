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
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
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

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        Item used = findById(id);
        if (used != null){
            used.setName(item.getName());
            rsl = true;
        }
        return rsl;
    }
}