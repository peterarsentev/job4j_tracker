package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus};

        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }
}
