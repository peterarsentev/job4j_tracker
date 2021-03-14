package ru.job4j.colllection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        HashSet<String> compare = new HashSet<>(Arrays.asList(text));
        rsl = check.containsAll(compare);
        return rsl;
    }
}
