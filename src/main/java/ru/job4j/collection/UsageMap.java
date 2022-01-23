package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Antoshka@yandex.ru", "Antoshka");
        map.put("Polly@yandex.ru", "Polly");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
