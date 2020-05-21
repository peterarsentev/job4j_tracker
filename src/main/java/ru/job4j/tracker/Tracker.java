package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
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

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String name) {
        int sizeNew = 0;
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                result[sizeNew] = item;
                sizeNew++;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index].setId(id);
            items[index].setName(item.getName());
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}