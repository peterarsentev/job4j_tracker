package ru.job4j.tracker;

public class SearchItemIdAction implements UserAction {
    private final Output out;

    public SearchItemIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Найти заявку по Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==Найти заявку по Id==");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
