package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Show items by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item idItem = tracker.findById(id);
        boolean status = false;
        if (idItem != null) {
            System.out.println("Id заявки" + idItem);
            status = true;
        } else System.out.println("Заявка с данным id отсутствует");
        return status;
    }
}
