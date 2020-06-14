package ru.job4j.tracker;

public class FindNameAction implements UserAction{
    private final Output out;

    public FindNameAction(Output out){
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Show items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] rsl = tracker.findByName(name);
        if (rsl.length > 0) {
            for (Item item : rsl) {
                out.println(item);
            }
        } else out.println("Заявки с данным именем отсутствуют");
        return true;
    }
}
