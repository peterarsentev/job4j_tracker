package ru.job4j.tracker;

import static ru.job4j.tracker.StartUI.NL;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "Show all items.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] resultFindAll = tracker.findAll();
        System.out.println(NL + "Total items: " + resultFindAll.length);
        for (Item item : resultFindAll) {
            System.out.println(item);
        }
        return true;
    }
}
