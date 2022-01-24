package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class ItemTest {

        @Test
        public void whenItemSortAscByName() {

            List<Item> items = Arrays.asList(
                    new Item("Первая"),
                    new Item("Вторая"),
                    new Item("Третья")
            );
            List<Item> expected = Arrays.asList(
                    new Item("Вторая"),
                    new Item("Первая"),
                    new Item("Третья")
            );
            Collections.sort(items, new ItemAscByName());
            assertEquals(expected, items);
        }

    @Test
    public void whenItemSortDescByName() {

        List<Item> items = Arrays.asList(
                new Item("Первая"),
                new Item("Вторая"),
                new Item("Третья")
        );
        List<Item> expected = Arrays.asList(
                new Item("Третья"),
                new Item("Первая"),
                new Item("Вторая")
        );
        Collections.sort(items, new ItemDescByName());
        assertEquals(expected, items);
    }

}