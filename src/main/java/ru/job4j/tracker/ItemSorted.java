package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorted {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("one"),
                new Item("two"),
                new Item("five")
        );
        System.out.println(items);
        Collections.sort(items, new AscendingItem());
        System.out.println(items);

//        Collections.sort(items, new DiscendingItem());
    }

}
