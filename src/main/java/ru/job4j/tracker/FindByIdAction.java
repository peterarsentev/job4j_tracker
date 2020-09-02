package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int in = input.askInt("введите id");
        Item item = tracker.findById(in);
        if (item != null) {
            out.println("searched: " + item.toString());
        } else {
            out.println("was not found");
        }
        return true;
    }
}