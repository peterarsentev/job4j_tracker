package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemDescByNameTest {
    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("test2"), new Item("test3"), new Item("test1"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("test3"), new Item("test2"), new Item("test1"));
        assertThat(items, is(expected));
    }
}
