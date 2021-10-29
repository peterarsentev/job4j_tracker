package ru.job4j.collection;

import java.util.HashMap;
import java.util.HashSet;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("krufaxe@mail.ru", "Николаев Дмитрий Анатольевич");
        map.put("djrrhg@ttnm.com", "Иванов Семен петрович");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

    }
}
