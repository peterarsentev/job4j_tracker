package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Автобус едет на заправку");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Автобус перевозит " + number + " пассажиров");
    }

    @Override
    public double refuel(double liter) {
        return liter * 50.54;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(45);
        bus.refuel(100);
        System.out.println("Автобус заправился топливом на " +bus.refuel(100) + "р.");
    }
}
