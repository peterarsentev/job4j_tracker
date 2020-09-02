package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("== Delete ==");
        int id = input.askInt("Введите id удаляемого элемента");
        boolean valid = tracker.delete(id);
        if (valid) {
            out.println("Заявка была удалена!");
        } else {
            out.println("Ошибка удаления");
        }
        return true;
    }
}