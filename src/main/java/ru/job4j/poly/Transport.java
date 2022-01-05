package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(int numberPassengers);

    float refuel(float amountOfFuel);
}
