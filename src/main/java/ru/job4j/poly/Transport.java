package ru.job4j.poly;

public interface Transport {
    void goBy();

    void passengers(int number);

    double refuelPrice(double litresOfFuel);
}
