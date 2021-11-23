package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport{

    @Override
    public void run() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int number_passengers) {
        System.out.println("Число пассажиров");
    }

    @Override
    public float refuel(float amount_of_fuel) {
        return amount_of_fuel * 50;
    }
}

