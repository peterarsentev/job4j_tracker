package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorted {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("b"),
                new Item("a"),
                new Item("d"),
                new Item("c")
        );
        System.out.println(items);
        Collections.sort(items, new AscendingItem());
        System.out.println(items);
        System.out.println();
        Collections.sort(items, new DiscendingItem());
        System.out.println(items);
    }

}
