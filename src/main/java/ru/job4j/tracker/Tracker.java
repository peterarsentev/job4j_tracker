package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getName().equals(key)) {
                rsl.add(items.get(index));
            }
        }
        return rsl;
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

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index > -1) {
//            items.remove(index);
            item.setId(id);
            items.set(index, item);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index > -1) {
            items.remove(index);
            return true;
        }
        return false;
    }
}