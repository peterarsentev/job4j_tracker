package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.List;

public class SearchItemNameAction implements UserAction {
    private final Output out;

    public SearchItemNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Найти заявки по имени";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("==Найти заявки по имени==");
        String name = input.askStr("Введите имя: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявки с таким именем не найдена");
        }
        return true;
    }
}
