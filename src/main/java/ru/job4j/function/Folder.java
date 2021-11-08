package ru.job4j.function;

import java.util.Objects;

public class Folder {
    private String name;
    private int size;

    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Folder folder = (Folder) o;
        return size == folder.size && Objects.equals(name, folder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "Folder{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }
}