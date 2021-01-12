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

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if (item.getName().equals(key)) {
                rsl[count++] = item;
            }
        }
        return Arrays.copyOf(rsl, count);
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

    public boolean replace(int id, Item bugWithDesc) {
            if (indexOf(id) > -1) {
                items[indexOf(id)].setName(bugWithDesc.getName());
                return true;
            } else {
                return false;
            }
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index > -1) {
            items[index] = null;
            int startPos = index + 1;
            int length = size - startPos;
            System.arraycopy(items, startPos, items, index, length);
            items[size - 1] = null;
            size--;
            return true;
        }
            return false;
    }
}