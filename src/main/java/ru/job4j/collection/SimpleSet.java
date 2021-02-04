package ru.job4j.collection;

import java.util.Iterator;

public class SimpleSet<T> extends SimpleArray<T> implements Iterable<T> {
    public SimpleSet() {
        super();
    }

    @Override
    public void add(T model) {
//        if (!search(model)) {
//            super.add(model);
//        }
    }

    @Override
    public Iterator<T> iterator() {
        return super.iterator();
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
