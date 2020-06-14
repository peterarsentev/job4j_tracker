package ru.job4j.tracker;

public class AllListAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] rsl = tracker.findAll();
        for (Item item : rsl) {
            System.out.println(item);
        }
        return true;
    }
}
