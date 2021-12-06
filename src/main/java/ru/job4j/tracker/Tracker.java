package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<Item>(100);
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    //public Item[] findAll() {
    public List<Item> findAll() {
        //return Arrays.copyOf(items, size);
        return List.copyOf(items);
    }

    //public Item[] findByName(String key) {
    public List<Item> findByName(String key) {
        //Item[] result = new Item[size];
        List<Item> result = new ArrayList<>(size);
        //int count = 0;
//        for (int index = 0; index < size; index++) {
//            Item item = items[index];
//            if (key.equals(item.getName())) {
//                result[count] = item;
//                count++;
//            }
//        }
//        result = Arrays.copyOf(result, count);
        for (Item item : items) {
            if (key.equals(item.getName())) {
                result.add(item);
            }
        }
        return result;
    }

    private int indexOf(int id) {
        int result = -1;
//        for (int index = 0; index < size; index++) {
//            if (items[index].getId() == id) {
//                result = index;
//                break;
//            }
//        }
        for (Item item : items) {
            if (item.getId() == id) {
                result = items.indexOf(item);
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            //items[index] = item;
            items.set(index, item);
        }
        return result;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
//            System.arraycopy(items, index + 1, items, index, size - index - 1);
//            items[size - 1] = null;
//            size--;
            items.remove(index);
        }
        return result;
    }
}
