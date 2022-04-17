package ru.job4j.tracker.actions;

import ru.job4j.tracker.store.Store;
import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.io.Output;

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
    public boolean execute(Input input, Store tracker) {
        out.println("==Список всех заявок==");
        tracker.findAllByReact(System.out::println);
        return true;
    }
}
