package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "Delete item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id for delete item: "));
        if (tracker.delete(id)) {
            System.out.println("Good. Deleted id: " + id);
        } else {
            System.out.println("Error. Not delete id: " + id);
        }
        return true;
    }
}
