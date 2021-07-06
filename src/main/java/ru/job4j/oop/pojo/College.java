package ru.job4j.oop.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Petr");
        student.setLastName("Arsentev");
        student.setGroup("xx111x");
        student.setCreated(new Date());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(student.getFirstName() + " " + student.getLastName()
                + " : group - " + student.getGroup()
                + ", date - " + dateFormat.format(student.getCreated()));
    }
}
