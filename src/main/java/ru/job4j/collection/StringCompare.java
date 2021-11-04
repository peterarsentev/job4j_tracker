package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
            int i = 0;
            while (i < Math.min(left.length(), right.length())) {
                if (left.charAt(i) != right.charAt(i)) {
                    return Character.compare(left.charAt(i), right.charAt(i));
                }
                i++;
            }
        return Integer.compare(left.length(), right.length());
    }
}