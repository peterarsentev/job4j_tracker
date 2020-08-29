package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman man = new Freshman();
        Studyman studyman = man;
        Object object = studyman;
    }
}
