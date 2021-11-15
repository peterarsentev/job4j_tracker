package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentTest {
    @Test
    public void whenCollectStudent() {
        List<Student> studentList = List.of(
                new Student(30, "Nikolaev"),
                new Student(60, "Sidorov"),
                new Student(80, "Petrov"),
                new Student(80, "Petrov")
        );
       Student student = new Student(100, "Voronov");
        Map<String, Student> rsl = student.collect(studentList);
        Map<String, Student> extended = new HashMap<>();
        extended.put("Petrov", new Student(80, "Petrov"));
        extended.put("Nikolaev", new Student(30, "Nikolaev"));
        extended.put("Sidorov", new Student(60, "Sidorov"));

        assertThat(rsl, is(extended));
    }
}
