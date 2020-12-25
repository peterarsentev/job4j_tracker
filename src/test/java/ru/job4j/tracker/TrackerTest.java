package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", "1", replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(System.lineSeparator() + "=== Quit item ====" + System.lineSeparator()));

    }

    @Test
    public void whenFindAllAction() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        String findAll1 = "FindAll1";
        String findAll2 = "FindAll2";
        Item item1 = tracker.add(new Item(findAll1));
        Item item2 = tracker.add(new Item(findAll2));
        UserAction[] actions = {
                new FindAllAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("=== Show all items ====" + System.lineSeparator() +
                "ID: " + item1.getId() + System.lineSeparator() +
                "Name: " + item1.getName() + System.lineSeparator() +
                "Date of creation: " + item1.getCreated() + System.lineSeparator() +
                "ID: " + item2.getId() + System.lineSeparator() +
                "Name: " + item2.getName() + System.lineSeparator() +
                "Date of creation: " + item2.getCreated() + System.lineSeparator() +
                System.lineSeparator() + "=== Quit item ====" + System.lineSeparator()));
    }

    @Test
    public void whenFindItemByID() {
        Output output = new StubOutput();
        String findByID = "FindByID";
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(findByID));
        UserAction[] actions = {
                new FindItemByIDAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(System.lineSeparator() +
                "=== Find item by Id ====" + System.lineSeparator() +
                "Item " + item.getId() + " found" + System.lineSeparator() +
                System.lineSeparator() + "=== Quit item ====" + System.lineSeparator()));
    }

    @Test
    public void whenFindItemByName() {
        Output output = new StubOutput();
        String findByName = "FindByName";
        Input in = new StubInput(
                new String[]{"0", findByName, "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(findByName));
        UserAction[] actions = {
                new FindItemByNameAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(System.lineSeparator() +
                "=== Find items by name ====" + System.lineSeparator() + "ID: "
                + item.getId() + System.lineSeparator() +
                "Name: " + item.getName() + System.lineSeparator() +
                "Date of creation: " + item.getCreated() + System.lineSeparator() +
                System.lineSeparator() + "=== Quit item ====" + System.lineSeparator()));
    }

}