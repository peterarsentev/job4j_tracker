package ru.job4j.colllection.exam;

import java.util.HashMap;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        HashMap<Character, Integer> map = createMap(first);
        if (left.length() != right.length()) {
            return false;
        }
        for (char c : second) {
            if (!map.containsKey(c)) {
                return false;
            }
            if (map.get(c) == 1) {
                map.remove(c);
            } else if (map.get(c) > 1) {
                map.put(c, map.get(c) - 1);
            }
        }
        return map.size() == 0;
    }

    private static HashMap<Character, Integer> createMap(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }
}
