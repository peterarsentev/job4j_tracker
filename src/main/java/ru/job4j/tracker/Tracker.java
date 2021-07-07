package ru.job4j.tracker;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    //добавление заявок
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
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

    //получение заявки по id
    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) == -1) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (findById(id) != null) {
                int currentID = items[i].getId();
                items[i] = item;
                items[i].setId(currentID);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(int id) {
        if (indexOf(id) == -1) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (id == items[i].getId()) {
                System.arraycopy(this.items, i + 1, items, i, size - i);
                size--;
                result = true;
                break;
            }
        }
        return result;
    }
    //получение списка всех заявок
     public Item[] findAll() {
         ArrayList<Item> itemsList = new ArrayList<>();
         for (Item item: items) {
             if (item != null && item.getName() != null) {
                 itemsList.add(item);
             }
         }
         return itemsList.toArray(new Item[0]);
    }

     //получение списка по имени
     public Item[] findByName(String key) {
        ArrayList<Item> itemsList = new ArrayList<>();
         for (int index = 0; index < size; index++) {
             if (key.equals(items[index].getName())) {
                itemsList.add(items[index]);
             }
         }
         return itemsList.toArray(new Item[0]);
     }
}