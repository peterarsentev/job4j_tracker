package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItemId() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItemName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test123", "123");
        tracker.add(item);
        Item result = tracker.findByName(item.getName());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenAddnewItenThenFindItemFromAllItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test123", "123");
        tracker.add(item);
        Item[] result = tracker.findAll();
        int i = 0;
        for (int index = 0; index < result.length ; index++) {
            if(result[index].equals(item)) {
                i = index;
            }
        }
         assertThat(result[i], is(item));
    }
}