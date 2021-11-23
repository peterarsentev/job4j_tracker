package ru.job4j.poly;

public class BusOld {
    public class Bus implements Transport {

        @Override
        public void run() {
            System.out.println("Поехали");
        }

        @Override
        public void passengers(int passengers) {
            System.out.println("Число пассажиров: " + passengers);
        }

        @Override
        public float refuel(float fuel) {
            return fuel * 50;
        }
    }
}
