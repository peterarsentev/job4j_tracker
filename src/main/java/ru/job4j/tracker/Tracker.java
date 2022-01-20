package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> newMass = new ArrayList<>();
        //int count = 0;
        for (int index = 0; index < items.size(); index++) {
            if (key.equals(items.get(index).getName())) {
                newMass.add(items.get(index));
                //count++;
            }
        }

        //return Arrays.copyOf(newMass, count);
        return List.copyOf(newMass);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.add(index, item);
            items.remove(index + 1);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            /*System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;*/
            items.remove(id - 1);
        }
        return rsl;
    }
}