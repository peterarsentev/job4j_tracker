package ru.job4j.tracker;

public class QuitAction implements UserAction{

    @Override
    public String name() {
        return "=== Quit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
