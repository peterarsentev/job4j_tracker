package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftMas = left.split(". ");
        String[] rightMas = right.split(". ");
        return Integer.compare(Integer.parseInt(leftMas[0]), Integer.parseInt(rightMas[0]));
    }
}