package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Kulibin");
        student.setGroup(566);
        student.setDate(new Date());
        System.out.println("Student " + student.getName() + " studies in the " + student.getGroup()
                + " group since " + student.getDate());
    }
}
