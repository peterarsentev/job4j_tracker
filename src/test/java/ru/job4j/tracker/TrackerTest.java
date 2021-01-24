package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItemId() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItemName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test123", "123");
        tracker.add(item);
        List<Item> result = tracker.findByName(item.getName());
        assertThat(result.get(0).getName(), is(item.getName()));
    }

    @Test
    public void whenAddnewItenThenFindItemFromAllItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test123", "123");
        tracker.add(item);
        List<Item> result = tracker.findAll();
        int i = 0;
        for (int index = 0; index < result.size(); index++) {
            if (result.get(index).equals(item)) {
                i = index;
            }
        }
        assertThat(result.get(i), is(item));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}
