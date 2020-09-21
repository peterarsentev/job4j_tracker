package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = Character.compare(o1.charAt(1), o2.charAt(1));
        if (rsl == 0) {
            return o1.compareTo(o2);
        } else {
            return rsl;
        }
    }
}