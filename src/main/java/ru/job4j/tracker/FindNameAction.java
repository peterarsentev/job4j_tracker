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
        boolean status = false;
        if (rsl.length > 0) {
            for (Item item : rsl) {
                System.out.println(item);
                status = true;
            }
        } else System.out.println("Заявки с данным именем отсутствуют");
        return status;
    }
}
