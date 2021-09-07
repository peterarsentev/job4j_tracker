package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Locale;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lapenok Veronika");
        student.setGroup("13G");
        student.setAdmissionDate(LocalDate.of(2021, 07, 28));

        System.out.println(student.getName() + " study in the group number " + student.getGroup() +
                " since " + student.getAdmissionDate());
    }
}
