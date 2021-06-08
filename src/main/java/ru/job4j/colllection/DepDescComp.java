package ru.job4j.colllection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        int rsl = right[0].compareTo(left[0]);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}
