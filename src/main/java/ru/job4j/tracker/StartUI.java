package ru.job4j.tracker;

import ru.job4j.tracker.actions.*;
import ru.job4j.tracker.io.*;
import ru.job4j.tracker.store.HbmTracker;
import ru.job4j.tracker.store.MemTracker;
import ru.job4j.tracker.store.SqlTracker;
import ru.job4j.tracker.store.Store;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выберете: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неправильный ввод вы должны ввести число от 0 до "
                       + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {

        out.println("Меню.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Store tracker = new SqlTracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new FindAllAction(output));
        actions.add(new ReplaceAction(output));
        actions.add(new DeleteItemAction(output));
        actions.add(new SearchItemIdAction(output));
        actions.add(new SearchItemNameAction(output));
        actions.add(new GCTestAction(output));
        actions.add(new Exit());
        new StartUI(output).init(input, tracker, actions);
    }
}

