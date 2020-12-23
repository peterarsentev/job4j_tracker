package ru.job4j.tracker;

public class FindItemByIDAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item " + id + " found");
        } else {
            System.out.println("Item with this id " + id + " not found");
        }
        return true;
    }
}
