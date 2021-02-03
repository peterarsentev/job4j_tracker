package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String[] orig = origin.split(" ");
        String[] lines = line.split(" ");

        Set<String> originSet = new HashSet<>();

        for (String s : orig) {
            originSet.add(s.replaceAll("\\p{P}", ""));
        }

        for (String l : lines) {
            if (!originSet.contains(l)) {
                return false;
            }
        }
        return true;
    }
}
