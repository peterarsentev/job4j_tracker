package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    Map<String, Student> collect2(List<Student> students) { // этот метод
        return  students.stream()
                .distinct()
                .collect(Collectors.toMap(Student::getSurname, e -> e));
    }
}
