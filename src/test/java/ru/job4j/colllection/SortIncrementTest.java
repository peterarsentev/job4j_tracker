package ru.job4j.colllection;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortIncrementTest {

    @Test
    public void whenIncrementItem() {
        List<Item> items = Arrays.asList(new Item("Reboot server"), new Item("Fix bugs"),
                new Item("Impl task")
        );
        Collections.sort(items, new SortIncrement());
        List<Item> excepted = List.of(new Item("Fix bugs"),
                new Item("Impl task"), new Item("Reboot server"));
        assertThat(items, is(excepted));
    }
}