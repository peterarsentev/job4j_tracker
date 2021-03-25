package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> convert(List<Student> students) {
        Map<String, Student> map = students.stream()
                .distinct().collect(Collectors.toMap(
                        e -> e.getSurname(),
                        e -> e
                ));
        return map;
    }
}
