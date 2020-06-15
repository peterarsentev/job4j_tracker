package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers;
    private int oil;
    private int price;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public Bus(int passengers, int oil) {
        this.passengers = passengers;
        this.oil = oil;
    }

    public Bus(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void go() {

    }

    @Override
    public void passenger(int passengers) {
        Bus bus1 = new Bus(passengers);
        bus1.setPassengers(passengers);
    }

    @Override
    public int fillUp(int oil) {
        return price * oil;
    }
}
