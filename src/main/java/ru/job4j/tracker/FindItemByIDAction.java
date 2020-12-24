package ru.job4j.tracker;

public class FindItemByIDAction implements UserAction {
    private final Output out;

    public FindItemByIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(System.lineSeparator() + "=== Find item by Id ====");
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
