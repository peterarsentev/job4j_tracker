package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder f : list) {
            if (predicate.test(f)) {
                result.add(f);
            }
        }
        return result;
    }
}
