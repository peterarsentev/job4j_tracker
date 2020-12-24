package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            showItems(items);
        } else {
            System.out.println("Items with this name not found");
        }
        return false;
    }

    private void showItems(Item[] items) {
        for (Item item : items) {
            System.out.println("ID: " + item.getId() + System.lineSeparator() +
                    "Name: " + item.getName() + System.lineSeparator() +
                    "Date of creation: " + item.getCreated());
        }
    }
}
