package ru.job4j.oop;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String name){
        super(name);
        System.out.println(name);
    }
}
