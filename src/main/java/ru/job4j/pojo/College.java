package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Dmitrii Nikolaev");
        student.setNumberGroup(5511);
        student.setDate("1.09.2004г.");
        System.out.println(student.getName());
        System.out.println(student.getNumberGroup());
        System.out.println(student.getDate());
    }
}
