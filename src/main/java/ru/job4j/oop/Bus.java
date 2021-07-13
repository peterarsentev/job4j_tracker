package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        String name = "Kate";
        System.out.println(name + " не выбрала - " + getClass().getSimpleName()
                + " из-за большого времени в дороге");
    }

    public void speed() {
        int speed = 60;
        System.out.println("Скорость автобуса - " + speed + " км/ч");
    }
}
