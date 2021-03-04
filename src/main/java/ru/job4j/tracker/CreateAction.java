package ru.job4j.tracker;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Создать новую заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==Создать новую заявку==");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
