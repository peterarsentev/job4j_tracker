package ru.job4j.tracker;

import static ru.job4j.tracker.StartUI.NL;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id for edit item: "));
        Item newItem = new Item(input.askStr("Enter new name: "));
        if (tracker.replace(id, newItem)) {
            System.out.println("Good. Edit end");
        } else {
            System.out.println("Error. Edit end");
        }
        return true;
    }
}