package ru.job4j.poly;

public class CityBus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Ездит по городу");
    }
}
