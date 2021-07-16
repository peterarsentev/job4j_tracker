package ru.job4j.tracker;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;


public class StartUlTest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUl.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "replaced item"
        };
        StartUl.EditItem(tracker, new StubInput(answers));
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(1,"test");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId())
        };
        StartUl.deleteItem(tracker, new StubInput(answers));
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced, is(nullValue()));
    }
}