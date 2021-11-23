package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(int number_passengers);

    float refuel(float amount_of_fuel);


}
