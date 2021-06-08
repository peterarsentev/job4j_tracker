package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(30);
        System.out.println("first : " + first.load + ". another : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". another : " + second.load);

    }

}
