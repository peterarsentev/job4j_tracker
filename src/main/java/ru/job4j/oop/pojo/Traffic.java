package ru.job4j.oop.pojo;

import ru.job4j.oop.Airplane;
import ru.job4j.oop.Bus;
import ru.job4j.oop.Train;
import ru.job4j.oop.Vehicle;

import java.lang.invoke.VarHandle;

public class Traffic {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{ train, bus, airplane};
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }
}
