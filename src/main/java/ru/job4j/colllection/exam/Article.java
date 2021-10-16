package ru.job4j.colllection.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String[] originStr = origin.replaceAll("\\p{P}", "").split("\\s");
        String[] compareStr = line.replaceAll("\\p{P}", "").split("\\s");
        Set<String> set = new HashSet<>(Arrays.asList(originStr));
        for (String s : compareStr) {
            if (!set.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
