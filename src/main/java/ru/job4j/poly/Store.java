package ru.job4j.poly;

public interface Store {

    void save(String value);

    String[] load();
}
