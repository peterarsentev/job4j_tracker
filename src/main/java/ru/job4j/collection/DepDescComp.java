package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] departament1 = o1.split("/");
        String[] departament2 = o2.split("/");
        if (departament2[0].compareTo(departament1[0]) == 0) {
            return o1.compareTo(o2);
        } else {
            return departament2[0].compareTo(departament1[0]);
        }
    }
}
