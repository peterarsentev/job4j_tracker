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

    //получение заявки по id
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
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