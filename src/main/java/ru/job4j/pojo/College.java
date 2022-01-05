package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Василий Пупкин");
        student.setGroup("ММ12");
        student.setAdmission(new Date());
        System.out.println(student.getFio() + " has a group - " + student.getGroup()
                + " : " + student.getAdmission());
    }
}
