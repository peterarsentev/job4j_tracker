package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new Exit());
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
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

        List<UserAction> actions = new ArrayList<>();
        actions.add(new EditAction(output));
        actions.add(new Exit());
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
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(output));
        actions.add(new Exit());
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
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()));

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
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindAllAction(output));
        actions.add(new Exit());
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() + "0. " + actions.get(0).name() +
                System.lineSeparator() + "1. Exit" + System.lineSeparator() + "=== Show all items ====" +
                System.lineSeparator() + "ID: " + item1.getId() + System.lineSeparator() + "Name: " + item1.getName() +
                System.lineSeparator() + "Date of creation: " + item1.getCreated() + System.lineSeparator() +
                "ID: " + item2.getId() + System.lineSeparator() +
                "Name: " + item2.getName() + System.lineSeparator() +
                "Date of creation: " + item2.getCreated() + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. " +  actions.get(0).name() + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
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
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindItemByIDAction(output));
        actions.add(new Exit());
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "0. " + actions.get(0).name() + System.lineSeparator() + "1. Exit" + System.lineSeparator() +
                System.lineSeparator() + "=== Find item by Id ====" + System.lineSeparator() +
                "Item " + item.getId() + " found" + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. " + actions.get(0).name() + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
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
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindItemByNameAction(output));
        actions.add(new Exit());
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() + "0. " +
                actions.get(0).name() + System.lineSeparator() + "1. Exit" + System.lineSeparator() +
                System.lineSeparator() + "=== Find items by name ====" + System.lineSeparator() + "ID: "
                + item.getId() + System.lineSeparator() + "Name: " + item.getName() + System.lineSeparator() +
                "Date of creation: " + item.getCreated() + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. " + actions.get(0).name() + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"8", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}