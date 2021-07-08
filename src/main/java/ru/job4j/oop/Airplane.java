package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("The plane is flying");
    }
}
