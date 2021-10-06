package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student Student = new Student();
        Student.setName("Dmitrii Nikolaev");
        Student.setNumberGroup(5511);
        Student.setDate("1.09.2004г.");
        System.out.println(Student.getName());
        System.out.println(Student.getNumberGroup());
        System.out.println(Student.getDate());


    }
}
