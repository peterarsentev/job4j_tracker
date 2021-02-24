package ru.job4j.map;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CollegeTest {
    private Map<Student, Set<Subject>> students;

    @Before
    public void setUp() {
        students = Map.of(
                new Student("Student1", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                ),
                new Student("Student2", "000002", "201-18-15"),
                Set.of(
                        new Subject("Economic", 75),
                        new Subject("Sociology", 65)
                )
        );
    }

    @Test
    public void whenAccountIsOptionalEmpty() {
        College college = new College(students);
        assertThat(college.findByAccount("000010"), is(Optional.empty()));
    }

    @Test
    public void whenAccountIsOptionalNotEmpty() {
        College college = new College(students);
        assertThat(college.findByAccount("000001").get().getGroup(), is("201-18-15"));
    }

    @Test
    public void whenSubjectIsOptionalEmptyWithNotFoundAccount() {
        College college = new College(students);
        assertThat(college.findBySubjectName("000010", "Sociology"), is(Optional.empty()));
    }

    @Test
    public void whenSubjectIsOptionalEmptyWithFoundAccount() {
        College college = new College(students);
        assertThat(college.findBySubjectName("000001", "Sociology"), is(Optional.empty()));
    }

    @Test
    public void whenSubjectIsOptionalNotEmpty() {
        College college = new College(students);
        assertThat(college.findBySubjectName("000002", "Sociology").get().getScore(), is(65));
    }
}