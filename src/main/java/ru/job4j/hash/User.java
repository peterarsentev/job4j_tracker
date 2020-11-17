package ru.job4j.hash;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
    private String name;
    private int children;
    private Calendar birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return children == user.children &&
                Objects.equals(name, user.name);
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        Map<User, Integer> map = new HashMap<>();
        Integer value1 = 1;
        Integer value2 = 2;
        map.put(user1, value1);
        map.put(user2, value2);
        System.out.println(map.toString());
    }

}