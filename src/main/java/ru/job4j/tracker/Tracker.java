package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item[] findAll() {
        Item[] res = new Item[items.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = items.get(i);
        }
        return res;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.size()];
        int sizeFindByName = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (items.get(index).getName().equals(key)) {
                rsl[sizeFindByName] = items.get(index);
                sizeFindByName++;
            }
        }
        return Arrays.copyOf(rsl, sizeFindByName);
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
            item.setId(id);
            items.add(item);
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