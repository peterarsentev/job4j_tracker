package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        final int EQUALS = 0;
        final int MORE = 1;
        final int LESS = -1;

        int result = EQUALS;
        if (!left.equals(right)) {
            for (int index = 0; index < left.length(); index++) {
                if (left.charAt(index) > right.charAt(index)) {
                    result = MORE;
                    break;
                } else if (left.charAt(index) < right.charAt(index)) {
                    result = LESS;
                    break;
                }
            }
            if (result == EQUALS) {
                if (left.length() < right.length()) {
                    result = LESS;
                } else {
                    result = MORE;
                }
            }
        }
        return result;
    }
}
