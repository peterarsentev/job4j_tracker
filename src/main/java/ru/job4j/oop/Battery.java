package ru.job4j.oop;

public class Battery {

    private int load;

    private Battery(int value){
        this.load = value;
    }

    private void exchange(Battery another){
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery mobile = new Battery(50);
        Battery ret = new Battery(20);
        System.out.println("first : " + mobile.load + ". second : " + ret.load);
        mobile.exchange(ret);
        System.out.println("first : " + mobile.load + ". second : " + ret.load);
    }
}
