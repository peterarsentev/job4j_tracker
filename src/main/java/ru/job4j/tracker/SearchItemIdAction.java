package ru.job4j.tracker;

public class SearchItemIdAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
