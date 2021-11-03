package ru.job4j.tracker;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void sort() {
        List<Item> items = Arrays.asList(
                new Item(6, "Tom"),
                new Item(2, "Ben"),
                new Item(1, "Mike"),
                new Item(3, "Bob"),
                new Item(4, "Don"),
                new Item(5, "Raf"));

        List<Item> expected = Arrays.asList(
                new Item(1, "Mike"),
                new Item(2, "Ben"),
                new Item(3, "Bob"),
                new Item(4, "Don"),
                new Item(5, "Raf"),
                new Item(6, "Tom"));
        Collections.sort(items);
        assertEquals(expected, items);
    }

    @Test
    public void ascending() {
        List<Item> items = Arrays.asList(
                new Item(6, "Tom"),
                new Item(2, "Ben"),
                new Item(1, "Mike"),
                new Item(3, "Bob"),
                new Item(4, "Don"),
                new Item(5, "Raf"));

        List<Item> expected = Arrays.asList(
                new Item(1, "Mike"),
                new Item(2, "Ben"),
                new Item(3, "Bob"),
                new Item(4, "Don"),
                new Item(5, "Raf"),
                new Item(6, "Tom"));
        Collections.sort(items, new Ascending());
        assertEquals(expected, items);
    }

    @Test
    public void descending() {
        List<Item> items = Arrays.asList(
                new Item(6, "Tom"),
                new Item(2, "Ben"),
                new Item(1, "Mike"),
                new Item(3, "Bob"),
                new Item(4, "Don"),
                new Item(5, "Raf"));

        List<Item> expected = Arrays.asList(
                new Item(6, "Tom"),
                new Item(5, "Raf"),
                new Item(4, "Don"),
                new Item(3, "Bob"),
                new Item(2, "Ben"),
                new Item(1, "Mike"));
        Collections.sort(items, new Descending());
        assertEquals(expected, items);
    }
}
