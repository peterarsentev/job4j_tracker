package ru.job4j.lambda;

import ru.job4j.pojo.Student;
import java.util.function.*;
import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {

        Comparator<Student> comparator = (Student o1, Student o2) -> {
            return Integer.compare(o1.getGroup(), o2.getGroup());
        };

        Function<Student, Mark> func = (value) -> Mark.markof(value);

        System.out.println(func.apply(new Student()));
    }
}