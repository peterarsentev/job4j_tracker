package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemAscByNameTest {
    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("test3"), new Item("test2"), new Item("test1"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("test1"), new Item("test2"), new Item("test3"));
        assertThat(items, is(expected));
    }
}
