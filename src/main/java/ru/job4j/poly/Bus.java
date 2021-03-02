package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Вместительность автобуса " + passengers);
    }

    @Override
    public double load(double amount) {
        return amount * 50;
    }
}
