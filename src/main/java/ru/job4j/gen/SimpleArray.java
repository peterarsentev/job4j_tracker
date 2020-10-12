package ru.job4j.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {

    private List<T> list;
    private int count;

    public SimpleArray(int count) {
        this.count = count;
        list = new ArrayList<>(count);
    }

    public void add(T model) {
        if (!(list.indexOf(null) > count)) {
            list.add(model);
        }
    }

    public boolean set(int index, T model) {
        if (Objects.checkIndex(index, count) == index) {
            list.set(index, model);
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (Objects.checkIndex(index, count) == count - 1) {
           list.remove(index);
           return false;
        } else if (Objects.checkIndex(index, count) == index) {
            System.arraycopy(list, index + 1, list, index, count - index - 1);
            return true;
        } else {
            return false;
        }
    }

    public T get(int index) {
        if (Objects.checkIndex(index, count) == index) {
            return list.get(index);
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) {
        SimpleArray<Integer> list = new SimpleArray<Integer>(3);
        list.add(2);
        list.add(3);
        list.add(3);
        list.remove(1);
    }
}
