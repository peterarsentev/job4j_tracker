package ru.job4j.collection;

import java.util.Comparator;
import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        return Integer.compare(parseInt(left.split(". ")[0]),
                parseInt(right.split(". ")[0]));
    }
}
