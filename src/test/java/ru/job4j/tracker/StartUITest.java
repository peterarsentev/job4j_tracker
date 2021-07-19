package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.actions.CreateAction;
import ru.job4j.tracker.actions.DeleteAction;
import ru.job4j.tracker.actions.EditAction;
import ru.job4j.tracker.actions.ExitAction;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    private final Output out = new StubOutput();

    @Test
    public void whenCreateAction() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenReplaceAction() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteAction() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void FindAllAction() {
        Input in = new StubInput(
                new String[] {
                        "0", "Item name",
                        "0", "Item name 2",
                        "0", "Item name",
                        "0", "Item name 1",
                        "0", "Item name"
                }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new CreateAction(out),
                new CreateAction(out),
                new CreateAction(out),
                new CreateAction(out),
                new ExitAction(out)
        };
    }

    @Test
    public void whenFindByNameAction() {

    }

    @Test
    public void whenFindByIdAction() {

    }

    @Test
    public void whenExitAction() {
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
}