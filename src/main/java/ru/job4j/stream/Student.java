package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {
    private String surname;

    private int score;

    public Student(int score, String surname) {
        this.surname = surname;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public Map<String, Student> collect(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        s -> s,
                        (s1, s2) -> s1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    @Override
    public String toString() {
        return "Student{"
               + "score=" + score
               + ", surname='" + surname + '\''
               + '}';
    }
}