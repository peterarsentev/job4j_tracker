package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void sorted() throws Exception {
        List<Item> items = Arrays.asList(
                new Item(2),
                new Item(5),
                new Item(1),
                new Item(4)
        );

        List<Item> items2 = Arrays.asList(
                new Item(1),
                new Item(2),
                new Item(4),
                new Item(5)
        );
        Collections.sort(items, new SortById());
        assertEquals(items, items2);
    }

    @Test
    public void inverseSorted() {
        List<Item> items = Arrays.asList(
                new Item(2),
                new Item(5),
                new Item(1),
                new Item(4)
        );

        List<Item> items2 = Arrays.asList(
                new Item(5),
                new Item(4),
                new Item(2),
                new Item(1)
        );
        Collections.sort(items, new InvSortById());
        assertEquals(items, items2);
    }
}