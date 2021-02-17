package ru.job4j;

import ru.job4j.collection.Job;
import ru.job4j.collection.JobDescByName;
import ru.job4j.collection.JobDescByPriority;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Tester {

    public static class User implements Comparable<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
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
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            return 0;
        }
    }

    public static Comparator<User> thenComparing() {
        Comparator<User> comparator = ascByName().thenComparing(descByAge());
        return comparator;
    }

    public static Comparator<User> ascByName() {
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
         return comparator;
    }

    public static Comparator<User> descByAge() {
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
         return comparator;
    }
}


