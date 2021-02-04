package ru.job4j.collection;

import java.util.Iterator;
import java.util.Objects;

public class SimpleSet<T> implements Iterable<T> {
    private SimpleArray<T> baseArray = new SimpleArray<>();

    public boolean add(T model) {
        if (check(model) || Objects.isNull(model)) {
            return false;
        }
        baseArray.add(model);
        return true;
    }

    private boolean check(T model) {
        for (T t : baseArray) {
            if (t.equals(model)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return baseArray.iterator();
    }

    public static void main(String[] args) {
        SimpleSet<Integer> set = new SimpleSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        //System.out.println(set.toString());
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
