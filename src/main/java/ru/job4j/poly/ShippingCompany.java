package ru.job4j.poly;

public class ShippingCompany {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle intercityBus = new IntercityBus();

        Vehicle[] vehicles = new Vehicle[] {airplane, train, intercityBus};
        for (Vehicle v : vehicles) {
            v.move();
            v.color();
        }
    }
}
