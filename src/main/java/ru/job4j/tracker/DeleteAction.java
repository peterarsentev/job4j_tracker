package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean status = false;
        if (tracker.delete(id)) {
            System.out.println("Success");
            status = true;
        } else {
            System.out.println("Fail");
        }
        return status;
    }
}
