package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(90);
        Battery second = new Battery(30);
        first.exchange(second);
        System.out.println("first: " + first.load + ". second: " + second.load);
    }
}
