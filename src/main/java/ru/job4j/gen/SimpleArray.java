package ru.job4j.gen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {

    private T[] list;
    private int count;

    public SimpleArray(T[] arr) {
        this.count = arr.length;
        list = arr;
    }

    public boolean add(T model) {
        for (T t : list) {
            if (t == null) {
                t = model;
                return true;
            }
        }
        return false;
    }

    public boolean set(int index, T model) {
        if (Objects.checkIndex(index, count) == index) {
            list[index] = model;
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (Objects.checkIndex(index, count) == count - 1) {
           list[index] = null;
           return true;
        } else if (Objects.checkIndex(index, count) == index) {
            System.arraycopy(list, index + 1, list, index, count - index - 1);
            list[count - 1] = null;
            return true;
        } else {
            return false;
        }
    }

    public T get(int index) {
        if (Objects.checkIndex(index, count) == index) {
            return list[index];
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int point = 0;

            @Override
            public boolean hasNext() {
                return point < count;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return list[point++];
            }
        };
    }

    public static void main(String[] args) {
        SimpleArray<Integer> list = new SimpleArray<Integer>(new Integer[]{1, 2, 3, 4});
        list.add(2);
        list.remove(1);
        System.out.println(list.toString());
        Iterator it = list.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
