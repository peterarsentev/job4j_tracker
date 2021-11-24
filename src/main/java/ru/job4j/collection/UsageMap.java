package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("veronika.lapenok@mail.ru", "Veronika Lapenok");
        users.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String mail : users.keySet()) {
            String surname = users.get(mail);
            System.out.println(mail + " - " + surname);
        }
    }
}
