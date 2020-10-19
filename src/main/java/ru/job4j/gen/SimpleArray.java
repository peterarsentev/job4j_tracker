package ru.job4j.gen;

import java.util.*;

public class SimpleArray<T> implements Iterable<T> {

    private T[] list;
    private int count;
    private int modcount;

    public SimpleArray() {
        list = (T[]) new Object[16];
        count = 0;
        modcount = 0;
    }

    public void add(T model) { //если больше нет свободных мест, то расширяем
        if (count == list.length) {
            extend();
            list[count++] = model;
        } else {
            list[count++] = model;
        }
        modcount++;
    }

    private void extend() {
        list = Arrays.copyOf(list, count + 1);
    }

    public boolean set(int index, T model) {
        if (Objects.checkIndex(index, count) == index) {
            list[index] = model;
            modcount++;
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (Objects.checkIndex(index, count) == count - 1) {
            list[index] = null;
            count--;
            modcount++;
            return true;
        } else if (Objects.checkIndex(index, count) == index) {
            System.arraycopy(list, index + 1, list, index, count - index - 1);
            list[count - 1] = null;
            count--;
            modcount++;
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
            private int expModCount = modcount;

            @Override
            public boolean hasNext() {
                if (modcount != expModCount) {
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
        SimpleArray<Integer> list = new SimpleArray<Integer>();
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(null);
        list.add(6);
        System.out.println(list.toString());
    }
}
