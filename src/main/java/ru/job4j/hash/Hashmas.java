package ru.job4j.hash;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Hashmas<T> implements Iterable<T> {
    private T[] hashmas;
    private String[] keys = new String[6];
    private int m;
    private int n;

    public Hashmas(int n) {
        if (n < 1) {
            this.n = 10;
        }
        this.n = n;
        hashmas = (T[]) new Object[n];
    }

    boolean insert(String key, T value) { //вставка
        int place = Math.abs(key.hashCode() % n);
        if (hashmas[place] == null && m < n) {
            hashmas[place] = value;
            keys[m++] = key;
            return true;
        }
        up();
        return false;
    }

    private void insert(String key, T value, T[] mas) { //вставка для рехеша
        int place = Math.abs(key.hashCode() % mas.length);
        if (mas[place] == null) {
            mas[place] = value;
        }
    }

    T get(String key) { //получение по ключу
        int place = Math.abs(key.hashCode() % n);
        return hashmas[place];
    }

    boolean delete(String key) { //удаление по ключу + удаление самого ключа
        int place = Math.abs(key.hashCode() % n);
        if (hashmas[place] != null) {
            hashmas[place] = null;
            for (int i = 0; i < keys.length; i++) {
                if (keys[i].equals(key)) {
                    keys[i] = null;
                    m--;
                    break;
                }
            }
            return true;
        }

        return false;
    }

    void up() { //расширение и рехеш
        int m = n * 2;
        T[] hashmas2 = (T[]) new Object[m];
        for (int i = 0; i < this.m; i++) {
            String key = keys[i];
            insert(key, get(key), hashmas2);
        }
        n = m;
        hashmas = hashmas2;
    }

    @Override
    public Iterator<T> iterator() {
        class IteratorCustom implements Iterator<T> {

            private int point;

            @Override
            public boolean hasNext() {
                return (point < hashmas.length) && (iter(point) != -1);
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int temp = point;
                point++;
                return hashmas[temp];
            }

            private int iter(int g) {
                int peso = -1;
                for (int i = g; i < hashmas.length; i++) {
                    if (hashmas[i] != null) {
                        peso = i;
                        break;
                    }
                }
                if (peso != -1) {
                    point = peso;
                }
                return peso;
            }
        }

        return new IteratorCustom();
    }

    @Override
    public String toString() {
        return "Hashmas{" +
                "hashmas=" + Arrays.toString(hashmas) +
                ", keys=" + Arrays.toString(keys) +
                ", m=" + m +
                ", n=" + n +
                '}';
    }
}
