package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Igor");
        student.setDate("24/08/2017");
        student.setGroup("B1");

        System.out.println(student.getName() + System.lineSeparator() + student.getGroup() + System.lineSeparator() + student.getDate());
    }

}
