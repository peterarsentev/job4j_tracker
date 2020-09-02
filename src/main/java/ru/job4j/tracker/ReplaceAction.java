package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Replace ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("== Replace! ==");
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
       if (tracker.replace(id, item)) {
           out.println("замена окончена");
       } else {
           out.println("замена не была выполнена!");
       }
        return true;
    }
}
