package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus1,plane,train,bus2};
        for (Vehicle v : vehicles){
            v.move();
        }

    }
}
