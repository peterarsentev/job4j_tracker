package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int percent){
        this.load = percent;
    }

    public void exchange(Battery another){
        if ((this.load + another.load) <= 100){
            this.load = this.load + another.load;
            another.load = 0;
        }
        else{
            this.load = 100;
            another.load = (this.load + another.load) - 100;
        }
    }

    public static void main(String args[]) {
        Battery first = new Battery(50);
        Battery second = new Battery(51);
        first.exchange(second);
        System.out.println(first.load);
    }
}
