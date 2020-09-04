
package ru.job4j.tracker;

import org.junit.Test;

import static java.lang.String.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {

    @Test
    public void findAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1" }
        );
        Tracker tracker = new Tracker();
        /*Item item = new Item("New");
        tracker.add(item);*/
        UserAction[] actions = {
                new FindAllAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Find all" + System.lineSeparator() + "1. Exit" +
                        System.lineSeparator() + "== Find all ==" + System.lineSeparator() + "0 objects with same name" +
                        System.lineSeparator() + "Menu." + System.lineSeparator() + "0. Find all" + System.lineSeparator() + "1. Exit" +
                        System.lineSeparator() + "== Exit! ==" + System.lineSeparator()
        ));
    }

    @Test
    public void findById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1" }
        );
        Tracker tracker = new Tracker();
        Item item = new Item("New");
        tracker.add(item);
        UserAction[] actions = {
                new FindByIdAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Find by id" + System.lineSeparator() + "1. Exit" +
                        System.lineSeparator() + "searched: Item{id=1, name='New'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() + "0. Find by id" + System.lineSeparator() + "1. Exit" +
                        System.lineSeparator() + "== Exit! ==" + System.lineSeparator()
        ));
    }

    @Test
    public void findByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0","ddd", "1" }
        );
        Tracker tracker = new Tracker();
        Item item = new Item("ddd");
        tracker.add(item);
        UserAction[] actions = {
                new FindByNameAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Find by name" + System.lineSeparator() + "1. Exit" +
                        System.lineSeparator() + "Item{id=1, name='ddd'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() + "0. Find by name" + System.lineSeparator() + "1. Exit" +
                        System.lineSeparator() + "== Exit! ==" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] { "-1", "0" }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                                + "== Exit! ==%n"
                )
        ));
    }
}

