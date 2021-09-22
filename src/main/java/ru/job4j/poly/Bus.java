package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Let's go!!!!");
    }

    @Override
    public void passengers(int passenger) {
        passenger = 10;
    }

    @Override
    public double fill(int fuel) {
        double price = 1.26;
        return fuel * price;
    }
}
