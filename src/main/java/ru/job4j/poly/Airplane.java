package ru.job4j.poly;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху.");
    }

    @Override
    public void speed() {
        System.out.println("Скорость 900 км/ч");
    }




}
