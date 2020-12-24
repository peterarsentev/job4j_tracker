package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println("ID: " + item.getId() + System.lineSeparator() +
                    "Name: " + item.getName() + System.lineSeparator() +
                    "Date of creation: " + item.getCreated());
        }
        return true;
    }
}
