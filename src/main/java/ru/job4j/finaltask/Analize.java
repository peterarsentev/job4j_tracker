package ru.job4j.finaltask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Analize {

    public Info diff(List<User> previous, List<User> current) {
        Info rsl = new Info();
        Map<Integer, String> old = new HashMap();
        Map<Integer, String> fresh = new HashMap();
        for (User user : previous) {
            old.put(user.getId(), user.getName());
        }
        for (User user : current) {
            fresh.put(user.getId(), user.getName());
        }
        for (Map.Entry<Integer, String> entry : fresh.entrySet()) {
            Integer key = entry.getKey();
            if (old.containsKey(key)) {
                if (!old.get(key).equals(entry.getValue())) {
                    rsl.addChanged();
                }
            } else {
                rsl.addAdded();
            }
        }
        for (Map.Entry<Integer, String> entry : old.entrySet()) {
            if (!fresh.containsKey(entry.getKey())) {
                rsl.addDeleted();
            }
        }
        return rsl;
    }
}
