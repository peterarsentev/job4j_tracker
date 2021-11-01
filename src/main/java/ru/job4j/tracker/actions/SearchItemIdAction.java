package ru.job4j.tracker.actions;

import ru.job4j.tracker.store.Store;
import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.io.Output;
import ru.job4j.tracker.model.Item;

public class SearchItemIdAction implements UserAction {
    private final Output out;

    public SearchItemIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Найти заявку по Id";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("==Найти заявку по Id==");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
