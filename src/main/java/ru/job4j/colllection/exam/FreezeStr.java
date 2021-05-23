package ru.job4j.colllection.exam;

import java.util.HashMap;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        HashMap<Character, Integer> leftMap = createMap(first);
        HashMap<Character, Integer> rightMap = createMap(second);
        if (left.length() != right.length()) {
            return false;
        }
        if (leftMap.equals(rightMap)) {
            return true;
        }
        return false;
    }

    private static HashMap<Character, Integer> createMap(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, 2);
            }
        }
        return map;
    }
}
