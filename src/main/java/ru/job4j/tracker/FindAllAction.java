package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            out.println("ID: " + item.getId() + System.lineSeparator() + "Name: " + item.getName()
                    + System.lineSeparator() + "Date of creation: " + item.getCreated());
        }
        return true;
    }
}
