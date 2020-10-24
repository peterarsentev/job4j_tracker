package ru.job4j.collection;

import java.util.Iterator;

public class SimpleStack<T> implements Iterable<T> {
    private ForwardLinked<T> linked = new ForwardLinked<T>();

    public T pop() {
        return linked.deleteLast();
    }

    public void pop2() {
        linked.deleteFirst();
    }

    public void push(T value) {
        linked.add(value);
    }

    public void pushDown(T value) {
        linked.add2(value);
    }

    @Override
    public Iterator<T> iterator() {
        return linked.iterator();
    }
}