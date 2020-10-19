package ru.job4j.list;

import ru.job4j.oop.Object;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList<T> implements Iterable<T> {
    private Node head;
    private Node sign;
    private int count = 0;
    private int modcount = 0;

    public void add(T value) {
        Node nodeNew = new Node(value);
        if (head != null) {
            sign.setNext(nodeNew);
        } else {
            head = nodeNew;
        }
        sign = nodeNew;
        count++;
        modcount++;
    }

    public T get(int index) {
        T rsl = null;
        if (Objects.checkIndex(index, count) == index) {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                rsl = (T) tmp.getData();
                tmp = tmp.getNext();
            }
        }
        return rsl;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node point = head;
            private int expModCount = modcount;

            @Override
            public boolean hasNext() {
                if (modcount != expModCount) {
                    throw new ConcurrentModificationException();
                }
                return point != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T rsl = (T) point.getData();
                point = point.getNext();
                return rsl;
            }
        };
    }
}
