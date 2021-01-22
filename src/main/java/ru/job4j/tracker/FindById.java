package ru.job4j.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "Find item by Id.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id for find item: "));
        Item resultFind = tracker.findById(id);
        if (resultFind != null) {
            System.out.println("Result find by id: " + resultFind);
        } else {
            System.out.println("Error. Not found id: " + id);
        }
        return true;
    }
}
