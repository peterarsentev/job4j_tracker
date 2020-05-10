package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Tven");
        student.setGroup("456-3");
        student.setEntryDate(new Date());

        System.out.println("Student " + student.getName() + " " + student.getSurname() + ". Entered the group "
                + student.getGroup() + " on " + student.getEntryDate());
    }
}
