package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> result = Optional.empty();
        for (Student student: students.keySet()) {
            if (account.equals(student.getAccount())) {
                result = Optional.of(student);
                break;
            }
        }
        return result;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> student = findByAccount(account);
        Optional<Subject> result = Optional.empty();
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject subject : subjects) {
                if (name.equals(subject.getName())) {
                    result = Optional.of(subject);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Optional<Student> student = college.findByAccount("000001");
        if (student.isPresent()) {
            System.out.println("Searching student: " + student.get());
        }
        Optional<Subject> english = college.findBySubjectName("000001", "English");
        if (english.isPresent()) {
            System.out.println("Subject score: " + english.get().getScore());
        }

    }
}
