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
                int choice = Character.compare(left.charAt(i), right.charAt(i));
                if (choice != 0) {
                    rsl = choice;
                    break;
                }
            }
        } catch (StringIndexOutOfBoundsException ex) {
            rsl = Integer.compare(left.length(), right.length());
        }
        return rsl;
    }
}