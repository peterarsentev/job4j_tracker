package ru.job4j.gen;

import java.util.*;

public class SimpleArray<T> implements Iterable<T>, Cloneable {

    private T[] list;
    private int count;

    public SimpleArray(int value) {
        list = (T[]) new Object[value];
        count = value;
    }

    public void add(T model) {
            list = extend();
            list[count - 1] = model;
    }

    private T[] extend() {
        T[] list2 = (T[]) new Object[++count];
        System.arraycopy(list, 0, list2, 0, list.length);
        return list2;
    }

    private int searchFree() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                return i;
            }
        }
        return -1;
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
           count--;
           return true;
        } else if (Objects.checkIndex(index, count) == index) {
            System.arraycopy(list, index + 1, list, index, count - index - 1);
            list[count - 1] = null;
            count--;
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
    protected T[] clone() throws CloneNotSupportedException {
        return (T[]) super.clone();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int point = 0;
            private T[] temp = list.clone();

            @Override
            public boolean hasNext() {
                if (!temp.equals(list)) {
                    throw new ConcurrentModificationException();
                }
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
        SimpleArray<Integer> list = new SimpleArray<Integer>(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(null);
        System.out.println(list.toString());
    }
}
