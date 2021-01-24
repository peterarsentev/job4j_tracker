package ru.job4j.tracker;

import java.util.List;

public class FindNameAction implements UserAction {
    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> rsl = tracker.findByName(name);
        if (rsl.size() > 0) {
            for (Item item : rsl) {
                out.println(item);
            }
        } else {
            out.println("Заявки с данным именем отсутствуют");
        }
        return true;
    }
}
