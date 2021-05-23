package ru.job4j.colllection.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String[] originStr = origin.replaceAll(",|!|;|\\.", "").split("\\s");
        String[] compareStr = line.replaceAll(",|!|;|\\.", "").split("\\s");
        Set<String> set = new HashSet<>(Arrays.asList(originStr));
        for (int i = 0; i < compareStr.length; i++) {
            if (set.add(compareStr[i])) {
                return false;
            }
        }
        return true;
    }
}
