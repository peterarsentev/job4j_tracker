package ru.job4j.tracker.actions;

import ru.job4j.tracker.store.Store;
import ru.job4j.tracker.io.Input;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "Выход";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        return false;
    }
}
