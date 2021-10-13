package ru.job4j.poly;

public class Autobus implements Vehicle{
    @Override
    public void move() {
        System.out.println("Автобус едет по трассе.");
    }

    @Override
    public void speed() {
        System.out.println("Скорость 100 км/ч");
    }



}
