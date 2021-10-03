package ru.job4j.oop;

public class Battery {
    private  int load;

    public Battery(int capacity) {
        this.load = capacity;
    }


    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = another.load * 2;
    }

    public static void main(String[] args) {
        Battery bank = new Battery(200);
        Battery smartphone = new Battery(50);
        System.out.println("bank " + bank.load + ". Smartphone " + smartphone.load);
        bank.exchange(smartphone);
        System.out.println("bank " + bank.load + ". Smartphone " + smartphone.load);
    }
}
