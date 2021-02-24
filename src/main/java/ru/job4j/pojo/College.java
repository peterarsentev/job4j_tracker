package ru.job4j.pojo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Gordon");
        student.setSurName("Freeman");
        student.setFaculty("Theoretical physics");
        student.setNumOfGroup(30900);
        student.setIncomingToStudy("02-09-1990");

        System.out.println(student.getName() + " "
                + student.getSurName()
                + " studied on faculty \""
                + student.getFaculty()
                + "\" in the group №"
                + student.getNumOfGroup() + " of "
                + student.getIncomingToStudy());
    }
}
