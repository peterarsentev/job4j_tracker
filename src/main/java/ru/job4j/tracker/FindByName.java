package ru.job4j.tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "Find items by name.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String newName = input.askStr("Enter name for find: ");
        Item[] resultFind = tracker.findByName(newName);
        if (resultFind.length > 0) {
            for (Item item : resultFind) {
                System.out.println("Result find by name: " + item);
            }
        } else {
            System.out.println("Error. Not found name: " + newName);
        }
        return true;
    }
}
