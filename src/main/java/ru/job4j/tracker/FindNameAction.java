package ru.job4j.tracker;

public class FindNameAction implements UserAction{
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
                System.out.println(item);
            }
        } else System.out.println("Заявки с данным именем отсутствуют");
        return true;
    }
}
