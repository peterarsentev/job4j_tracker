package ru.job4j.oop.task31;

public class College extends Freshman {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = student;
        Object object1 = freshman;
    }
}
