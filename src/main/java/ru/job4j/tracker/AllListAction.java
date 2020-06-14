package ru.job4j.tracker;

public class AllListAction implements UserAction {
    private final Output out;

    public AllListAction(Output out){
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] rsl = tracker.findAll();
        for (Item item : rsl) {
            out.println(item);
        }
        return true;
    }
}
