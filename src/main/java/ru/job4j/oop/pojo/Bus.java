package ru.job4j.oop.pojo;

public class Bus implements Transport{
    @Override
    public void move() {
        System.out.println("Bus move");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("The bus has " + passengers +  " passengers");
    }

    @Override
    public int refuel(int fuel) {
        return fuel / 10;
    }
}
