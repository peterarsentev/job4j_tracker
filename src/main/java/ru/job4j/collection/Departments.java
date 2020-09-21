package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        List<String> tmp2 = new ArrayList<>(tmp);
        Departments.sortAsc(tmp2);
        return tmp2;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(String::compareTo);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}