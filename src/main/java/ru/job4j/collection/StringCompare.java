package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int size = Math.min(left.length(), right.length());

        for (int i = 0; i < size; i++) {
            if (left.charAt(i) > right.charAt(i)) {
                rsl = 1;
                break;
            } else if (left.charAt(i) < right.charAt(i)) {
                rsl = -1;
                break;
            }
        }
        if (rsl == 0) {
            if (left.length() < right.length()) {
                return -1;
            } else if (left.length() > right.length()) {
                return 1;
            }
        }
        return rsl;
    }
}
