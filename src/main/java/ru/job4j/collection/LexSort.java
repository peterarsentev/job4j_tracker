package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNumbers = left.split("\\.");
        String[] rightNumbers = right.split("\\.");

        return Integer.compare(Integer.parseInt(leftNumbers[0]), Integer.parseInt(rightNumbers[0]));
    }
}