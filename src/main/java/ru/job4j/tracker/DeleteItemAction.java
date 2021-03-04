package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    private final Output out;

    public DeleteItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==Удалить заявку==");
        int id = input.askInt("Введите id: ");
        if (tracker.delete(id)) {
            out.println("Заявка удалена успешно");
        } else {
            out.println("Ошибка, такой заявки не существует");
        }
        return true;
    }
}
