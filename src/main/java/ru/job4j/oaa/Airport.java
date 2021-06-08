package ru.job4j.oaa;

public class Airport {
    public static void main(String[] args) {
        Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus.setName("A380");
        System.out.println(airbus);

        airbus = new Airbus("A319");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
    }
}
