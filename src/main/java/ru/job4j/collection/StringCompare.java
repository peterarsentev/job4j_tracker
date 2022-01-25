package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int end = left.length() < right.length() ? left.length() : right.length();
        for (int i = 0; i < end; i++) {
            int result = Integer.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                return result;
            }
        }
        return left.length() == right.length() ? 0 : Integer.compare(left.length(), right.length());
    }
}