package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String i : origin) {
            check.add(i);
        }
        for (String j : text) {
            if (!check.contains(j)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}