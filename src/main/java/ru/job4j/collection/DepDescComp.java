package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        int result = s2[0].compareTo(s1[0]);
        if (result == 0) {
            int end = Math.min(s1.length, s2.length);
            for (int i = 1; i < end; i++) {
                result = s1[i].compareTo(s2[i]);
                if (result != 0) {
                    return result;
                }
            }
            return Integer.compare(s1.length, s2.length);
        }
        return result;
    }
}