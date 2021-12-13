package ru.job4j.tracker.store;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class HbmTrackerTest {

    @Test
    public void whenCreate() {
        Store store = new HbmTracker();
        Item item = new Item("Item1");
        store.add(item);
        List<Item> all = store.findAll();
        assertEquals(item, all.get(0));
    }

    @Test
    public void whenReplace() {
        Store store = new HbmTracker();
        Item item = new Item("Item1");
        item.setId(1);
        Item item2 = new Item("replace item");
        store.add(item);
        store.replace(1, item2);
        assertThat(store.findById(1).getName(), is("replace item"));
    }


    @Test
    public void whenDelete() {
        Store store = new HbmTracker();
        Item item = new Item("Item1");
        item.setId(1);
        store.add(item);
        store.delete(1);
        assertThat(store.findAll().size(), is(0));
    }


    @Test
    public void whenFindAll() {
        Store store = new HbmTracker();
        Item item1 = new Item("Item1");
        Item item2 = new Item("Item2");
        store.add(item1);
        store.add(item2);
        assertEquals(List.of(item1, item2), store.findAll());
    }

    @Test
    public void whenFindByName() {
        Store store = new HbmTracker();
        Item item = new Item("Item1");
        store.add(item);
        assertEquals(store.findByName("Item1"), List.of(item));
    }

    @Test
    public void whenFindById() {
        Store store = new HbmTracker();
        Item item = new Item("Item1");
        item.setId(1);
        store.add(item);
        assertEquals(store.findById(1), item);
    }
}