package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {

        String[] orig = origin.split(" ");
        String[] lines = line.split(" ");

        Set<String> originSet = new HashSet<>();
        Set<String> lineSet = new HashSet<>(Arrays.asList(lines));

        for (int i = 0; i < orig.length; i++) {
            originSet.add(orig[i].replaceAll("[.,:;!?()]", ""));
        }

        Iterator<String> iterator = lineSet.iterator();
        while (iterator.hasNext()) {
            if (originSet.add(iterator.next())) {
                return false;
            }
        }
        return true;
    }
}
