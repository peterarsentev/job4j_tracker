package ru.job4j.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> mapCollect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap((a) -> a.getSurname(), (a) -> a, (a, b) -> a));
    }
}
