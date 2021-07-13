package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Количество километров - 876.");
    }

    @Override
    public void passengers(int numberPassengers) {
        System.out.println("Всего пассажиров " + numberPassengers);

    }

    @Override
    public int fillUp(int fuel) {
        int price = 49;
        return fuel * price;
    }
}
