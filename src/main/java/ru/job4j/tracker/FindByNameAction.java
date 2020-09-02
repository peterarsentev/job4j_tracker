package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("введите имя для поиска");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item iter
                    : item) {
                out.println(iter.toString());
            }
        } else {
            out.println("0 objects with same name");
        }
        return true;
    }
}
