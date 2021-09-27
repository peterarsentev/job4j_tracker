package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;


public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Store tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new Exit());
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));

    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Store tracker = new MemTracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(output));
        actions.add(new Exit());
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Store tracker = new MemTracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteItemAction(output));
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
        Store tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Меню." + System.lineSeparator()
                        + "0. Выход" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAllAction() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{"0", "1"});
        Store tracker = new MemTracker();
        Item item = new Item("findAll");
        tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new FindAllAction(output));
        actions.add(new Exit());
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Меню." + System.lineSeparator()
                + "0. Посмотреть все заявки" + System.lineSeparator() + "1. Выход"
                + System.lineSeparator() + "==Список всех заявок==" + System.lineSeparator() + item
                + System.lineSeparator() + "Меню." + System.lineSeparator()
                + "0. Посмотреть все заявки" + System.lineSeparator() + "1. Выход"
                + System.lineSeparator()));
    }

    @Test
    public void whenFindByNameAction() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{"0", "FindByName", "1"});
        Store tracker = new MemTracker();
        Item item = new Item("FindByName");
        tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new SearchItemNameAction(output));
        actions.add(new Exit());
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Меню." + System.lineSeparator()
                + "0. Найти заявки по имени" + System.lineSeparator() + "1. Выход"
                + System.lineSeparator() + "==Найти заявки по имени==" + System.lineSeparator()
                + item + System.lineSeparator() + "Меню." + System.lineSeparator()
                + "0. Найти заявки по имени" + System.lineSeparator() + "1. Выход"
                + System.lineSeparator()));
    }

    @Test
    public void whenFindByIdAction() {
        Output output = new StubOutput();
        Store tracker = new MemTracker();
        Item item = new Item("FindById");
        Item add = tracker.add(item);
        List<UserAction> actions = new ArrayList<>();
        actions.add(new SearchItemIdAction(output));
        actions.add(new Exit());
        Input input = new StubInput(new String[]{"0", String.valueOf(add.getId()), "1"});
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is("Меню." + System.lineSeparator()
                + "0. Найти заявку по Id" + System.lineSeparator() + "1. Выход"
                + System.lineSeparator() + "==Найти заявку по Id==" + System.lineSeparator() + item
                + System.lineSeparator() + "Меню." + System.lineSeparator()
                + "0. Найти заявку по Id" + System.lineSeparator() + "1. Выход"
                + System.lineSeparator()));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"6", "0"}
        );
        Store tracker = new MemTracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new Exit());
        new StartUI(out).init(in, tracker, actions);

        assertThat(out.toString(), is(
                String.format(
                        "Меню.%n"
                                + "0. Выход%n"
                                + "Неправильный ввод вы должны ввести число от 0 до 0%n"
                                + "Меню.%n"
                                + "0. Выход%n"
                )
        ));
    }

    @Test
    public void whenReplaceAction() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        ReplaceAction rep = new ReplaceAction(out);
        Input in = mock(Input.class);
        when(in.askInt(any(String.class))).thenReturn(1);
        when(in.askStr(any(String.class))).thenReturn(replacedName);

        rep.execute(in, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("==Редактировать заявку==" + ln + "Заявка отредактировна успешно" + ln));
        assertThat(tracker.findAll().get(0).getName(), is(replacedName));
    }

    @Test
    public void whenFindByIdActionMock() {
        Output output = new StubOutput();
        Store tracker = new MemTracker();
        Item item = new Item("FindById");
        tracker.add(item);
        SearchItemIdAction find = new SearchItemIdAction(output);

        Input input = mock(Input.class);

        when(input.askInt(any(String.class))).thenReturn(1);

        find.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(output.toString(),
                is("==Найти заявку по Id==" + ln + "Item{id=1, name='FindById'}" + ln));
    }

    @Test
    public void whenFindByNameActionMock() {
        Output output = new StubOutput();
        Store tracker = new MemTracker();
        String name = "FindByName";
        Item item = new Item(name);
        tracker.add(item);
        SearchItemNameAction find = new SearchItemNameAction(output);

        Input input = mock(Input.class);

        when(input.askStr(any(String.class))).thenReturn(name);

        find.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(output.toString(),
                is("==Найти заявки по имени==" + ln + "Item{id=1, name='FindByName'}" + ln));
    }

    @Test
    public void whenDeleteAction() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Delete item"));
        DeleteItemAction del = new DeleteItemAction(out);

        Input in = mock(Input.class);

        when(in.askInt(any(String.class))).thenReturn(1);

        del.execute(in, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("==Удалить заявку==" + ln + "Заявка удалена успешно" + ln));
    }
}