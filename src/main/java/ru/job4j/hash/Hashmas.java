package ru.job4j.hash;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Hashmas<K, T> implements Iterable<Hashmas.Entry<K, T>> {
    private int n;
    private Entry<K, T>[] hashmas;

    public static class Entry<K, T> {
        private T value;
        private K key;

        public Entry(K key, T value) {
            this.value = value;
            this.key = key;
        }

        public T getValue() {
            return value;
        }

        public K getKey() {
            return key;
        }
    }

    public Hashmas(int n) {
        if (n < 1) {
            this.n = 10;
        }
        this.n = n;
        hashmas = new Entry[n];
    }

    boolean insert(K key, T value) { //вставка
        int place = Math.abs(key.hashCode() % n);
        if (hashmas[place] == null) {
            hashmas[place] = new Entry(key, value);
            return true;
        }
        up();
        return false;
    }

    private void insert(K key, T value, Entry<K, T>[] mas) { //вставка для рехеша
        int place = Math.abs(key.hashCode() % mas.length);
        if (mas[place] == null) {
            mas[place] = new Entry<>(key, value);
        }
    }

    T get(String key) { //получение по ключу
        int place = Math.abs(key.hashCode() % n);
        return hashmas[place].value;
    }

    boolean delete(K key) { //удаление по ключу + удаление самого ключа
        int place = Math.abs(key.hashCode() % n);
        if (hashmas[place] != null) {
            hashmas[place] = null;
            return true;
        }
        return false;
    }

    private void up() { //расширение и рехеш
        int m = n * 2;
        Entry<K, T>[] hashmas2 = new Entry[m];
        Iterator<Entry<K, T>> it = iterator();
        while(it.hasNext()) {
            Entry hashma = it.next();
            insert((K) hashma.key,(T) hashma.value, hashmas2);
        }
        n = m;
        hashmas = hashmas2;
    }

    @Override
    public Iterator<Entry<K, T>> iterator() {
        class IteratorCustom implements Iterator<Entry<K, T>> {

            private int point;

            @Override
            public boolean hasNext() {
                return (point < hashmas.length) && (iter(point) != -1);
            }

            @Override
            public Entry<K, T> next() {
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
                ", n=" + n +
                '}';
    }
}
