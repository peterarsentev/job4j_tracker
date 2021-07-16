package ru.job4j.tracker;

public interface UserAction {

    String name();

    boolean execute(Input input, Tracker tracker);
}
