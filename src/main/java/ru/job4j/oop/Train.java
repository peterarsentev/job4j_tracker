package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        String name = "Kate";
        System.out.println(name + " не выбрала - " + getClass().getSimpleName() + " из-за нехватки билетов");
    }

    public void speed() {
        int speed = 100;
        System.out.println("Скорость поезда - " + speed + " км/ч");
    }
}
