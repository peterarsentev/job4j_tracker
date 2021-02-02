package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        Set<String> departments = new LinkedHashSet<>();

        for (int i = 0; i < deps.size(); i++) {
            String[] depsList = deps.get(i).split("/");
            String res = "";
            for (int j = 0; j < depsList.length; j++) {
                res += depsList[j];
                departments.add(res);
                res += "/";
            }
            res = "";
        }
        for (String d : departments) {
            rsl.add(d);
        }
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Comparator<String> comparator = new DepDescComp();
        Collections.sort(orgs, comparator);
    }
}
