package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
        System.out.println("Charging");
    }

    @Override
    public String toString() {
        return "Battery{" + "load =" + load + '}';
    }

    public static void main(String[] args) {
        Battery batterySource = new Battery(10);
        Battery batteryDestination = new Battery(2);
        getDataFromBattary(batterySource);
        getDataFromBattary(batteryDestination);
        batterySource.exchange(batteryDestination);
        getDataFromBattary(batterySource);
        getDataFromBattary(batteryDestination);    }

    private static void getDataFromBattary(Battery battery) {
        System.out.println(battery);
    }
}
