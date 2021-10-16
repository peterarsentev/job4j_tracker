package ru.job4j.poly;

public class Venicles {
    public static void main(String[] args) {
        Aircraft airbus = new Aircraft();
        Aircraft boing = new Aircraft();
        CityBus liaz = new CityBus();
        CityBus scania = new CityBus();
        Train sapsan = new Train();
        Train lastochka = new Train();
        Vehicle[] vehicles = {airbus, boing, liaz, scania, sapsan, lastochka};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
