package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("qwerty@mail.ru", "Kolya Beliy");
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}