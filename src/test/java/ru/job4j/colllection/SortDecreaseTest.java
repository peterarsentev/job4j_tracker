package ru.job4j.colllection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortDecreaseTest {

    @Test
    public void whenDecriseItem() {
        List<Item> items = Arrays.asList(new Item("Reboot server"), new Item("Fix bugs"),
                new Item("Impl task"));
        Collections.sort(items, new SortDecrease());
        List<Item> excepted = Arrays.asList(new Item("Reboot server"),
                new Item("Impl task"), new Item("Fix bugs"));
        assertThat(items, is(excepted));
    }
}