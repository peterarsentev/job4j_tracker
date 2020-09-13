package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    @Override
    public String toString() {
        return "Tracker{" + "items=" + items.toString() + '}';
    }

    private int ids = 1;
    private int size = 0;
    private final ArrayList<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(ids++);
        size++;
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public ArrayList<Item> findAll() {
        return items;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> found = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            Item item = items.get(index);
            if (item.getName().equals(key)) {
                found.add(item);
            }
        }
        return found;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            size--;
            rsl = true;
        }
        return rsl;
    }
}