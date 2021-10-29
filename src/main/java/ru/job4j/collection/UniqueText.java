package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String i : origin) {
            check.add(i);
        }
        System.out.println(check);
        HashSet<String> check1 = new HashSet<>();
        for (String j : text) {
            check1.add(j);
        }
        return check.equals(check1);
    }
}