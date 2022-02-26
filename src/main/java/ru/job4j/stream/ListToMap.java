package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream().collect(
                Collectors.toMap(
                   Student::getSurname,
                   obj -> obj,
                        (k1, k2) -> k1));
    }
}
