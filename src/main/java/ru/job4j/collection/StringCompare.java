package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return comp1(left, right);
    }

    private int comp1(String left, String right) {
        int len = Math.max(left.length(), right.length());
        int rsl = 0;
        try {
            for (int i = 0; i < len; i++) {
                if (left.charAt(i) > right.charAt(i)) {
                    rsl = 1;
                    break;
                } else if (left.charAt(i) < right.charAt(i)) {
                    rsl = -1;
                    break;
                }
            }
        } catch (StringIndexOutOfBoundsException ex) {
            if (left.length() > right.length()) {
                rsl = 1;
            } else {
                rsl = -1;
            }
        }
        return rsl;
    }
}