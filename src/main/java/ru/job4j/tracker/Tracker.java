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

    public Item[] findByName(String kay) {
        Item[] searchName = new Item[size];
        int number = 0;
        for (int index = 0; index < size; index++) {
            Item coincide = items[index];
            if (coincide.getName().equals(kay)) {
                searchName[number] = items[index];
                number++;
            }
        }
        searchName = Arrays.copyOf(searchName, number);
        return searchName;
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

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        if (indexOf(id) != -1 && id > 0 && id < 101) {
            items[indexOf(id)] = item;
            item.setId(id);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        if (indexOf(id) != -1 && id > 0 && id < 101) {
            System.arraycopy(items, indexOf(id) + 1, items, indexOf(id), size - indexOf(id) - 1);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}