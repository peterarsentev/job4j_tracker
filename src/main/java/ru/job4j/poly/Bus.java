package ru.job4j.poly;

public class Bus implements Transport {
    private int people;

    @Override
    public void ride() {
        System.out.println("еду на речку донецк");
    }

    @Override
    public void people(int human) {
        this.people = human;
    }

    @Override
    public double gas(double volume) {
        return volume * 65;
    }
}
