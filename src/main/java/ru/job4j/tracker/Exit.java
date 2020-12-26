package ru.job4j.tracker;

public class Exit implements UserAction {
//    private final Output out;

//    public Exit() {
//        this.out = out;
//    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
//        out.println(System.lineSeparator() + "=== Quit item ====");
        return false;
    }
}
