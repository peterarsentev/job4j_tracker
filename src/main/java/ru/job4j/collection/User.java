package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return year == user.year && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public int compareTo(User o) {
        int comp = this.name.compareTo(o.name);
        if (comp != 0) {
            return comp;
        } else {
            return Integer.compare(this.year, o.year);
        }
    }
}
