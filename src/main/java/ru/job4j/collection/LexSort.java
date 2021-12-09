package ru.job4j.collection;

import java.util.Comparator;
import java.util.Objects;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArray = left.split("\\.");
        String[] rightArray = right.split("\\.");
        int leftNumber = Integer.parseInt(leftArray[0]);
        int rightNumber = Integer.parseInt(rightArray[0]);
        return Integer.compare(leftNumber, rightNumber);
    }
}
