package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class StartUITest extends TestCase {

    @Test
    public void testCreateItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
}