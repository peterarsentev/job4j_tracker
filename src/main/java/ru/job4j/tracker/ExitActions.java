package ru.job4j.tracker;

public class ExitActions implements UserAction {
    @Override
    public String name() {
        return "Выход";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
