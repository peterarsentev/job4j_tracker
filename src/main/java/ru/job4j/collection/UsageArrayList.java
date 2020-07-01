package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add(0, "Lina");
        name.add(1, "Mina");
        name.add(2, "Kina");
        for (Object value : name) {
            System.out.println(value);
        }
    }
}
