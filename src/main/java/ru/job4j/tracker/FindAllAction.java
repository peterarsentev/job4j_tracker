package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Посмотреть все заявки";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==Список всех заявок==");
        for (Item item : tracker.findAll()) {
            out.println(item);
        }
        return true;
    }
}
