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
                new Student("Nikolaev", 30),
                new Student("Sidorov", 60),
                new Student("Petrov", 80),
                new Student("Petrov", 80)
        );
       Student student = new Student("Voronov", 100);
        Map<String, Student> rsl = student.collect(studentList);
        Map<String, Student> extended = new HashMap<>();
        extended.put("Petrov", new Student("Petrov", 80));
        extended.put("Nikolaev", new Student("Nikolaev", 30));
        extended.put("Sidorov", new Student("Sidorov", 60));

        assertThat(rsl, is(extended));
    }
}
