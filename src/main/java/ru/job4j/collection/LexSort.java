package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNumbers = left.split("\\.");
        String[] rightNumbers = right.split("\\.");

        if (Integer.parseInt(leftNumbers[0]) > Integer.parseInt(rightNumbers[0])) {
            return 1;
        }
        if (Integer.parseInt(leftNumbers[0]) < Integer.parseInt(rightNumbers[0])) {
            return -1;
        }
        return 0;
    }
}
