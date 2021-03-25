package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void whenListToMap() {
        List<Student> students = List.of(new Student(10, "Ivanov"), new Student(50, "Petrov"),
                new Student(70, "Smirnov"));
        ListToMap lst = new ListToMap();
        Map<String, Student> rsl = lst.convert(students);
        Map<String, Student> expected = Map.of("Ivanov", new Student(10, "Ivanov"),
                "Petrov", new Student(50, "Petrov"),
                "Smirnov",new Student(70, "Smirnov"));
        assertThat(rsl, is(expected));
    }
}