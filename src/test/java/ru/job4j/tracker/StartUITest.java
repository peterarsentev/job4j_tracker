
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
                new String[] {"0","1" }
        );
        Tracker tracker = new Tracker();
        Item item = new Item("New");
        tracker.add(item);
        UserAction[] actions = {
                new FindAllAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "[null]" + System.lineSeparator()
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
                "1" + System.lineSeparator()
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
                "Item{id=1, name='ddd'}" + System.lineSeparator()
        ));
    }

/*    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1" }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(1).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
         Добавим в tracker новую заявку
        Item item = tracker.add(new Item("Replaced item"));
         Входные данные должны содержать ID добавленной заявки item.getId()
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
         Добавим в tracker новую заявку
        Item item = tracker.add(new Item("Deleted item"));
         Входные данные должны содержать ID добавленной заявки item.getId()
        Input in = new StubInput(
                new String[] {"0", valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }*/
}

