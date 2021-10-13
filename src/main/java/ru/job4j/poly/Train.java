package ru.job4j.poly;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам.");
    }

    @Override
    public void speed() {
        System.out.println("Скорость 200 км/ч");
    }


}
