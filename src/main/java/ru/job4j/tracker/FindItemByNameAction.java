package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction {
    private final Output out;

    public FindItemByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(System.lineSeparator() + "=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println("ID: " + item.getId() + System.lineSeparator() +
                        "Name: " + item.getName() + System.lineSeparator() +
                        "Date of creation: " + item.getCreated());
            }
        } else {
            System.out.println("Items with this name not found");
        }
        return true;
    }
}
