package ru.job4j.poly;

public interface Transport {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Autobus();

        Vehicle[] vehicles = new Vehicle[] {airplane, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
            a.speed();
        }
    }
}
