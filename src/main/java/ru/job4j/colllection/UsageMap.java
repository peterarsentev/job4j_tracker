package ru.job4j.colllection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ivanov@gmail.com", "Ivanov Ivan");
        map.put("ivanov@gmail.com", "Ivanov Sergey");
        map.put("petrov@gmail.com", "Petrov Sergey");
        map.put("smirnov@gmail.com", "Smirnov Sergey");

        for (String s : map.keySet()) {
            String value = map.get(s);
            System.out.println(s + "=" + value);
        }
    }
}
