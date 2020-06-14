package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        return true;
    }
}
