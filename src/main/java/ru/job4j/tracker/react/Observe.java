package ru.job4j.tracker.react;

public interface Observe<T> {
    void receive(T model);
}
