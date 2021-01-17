package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;

public class ItemTest {

    @Test
    public void compareIDinDescending() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("one"));
        items.add(new Item("two"));
        items.add(new Item("three"));
        Collections.sort(items, Collections.reverseOrder());
        for (Item item : items) {
            System.out.println(item.getId());
        }

    }

    @Test
    public void compareIDinAscending() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("b"));
        items.add(new Item("a"));
        items.add(new Item("d"));
        items.add(new Item("c"));

        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}