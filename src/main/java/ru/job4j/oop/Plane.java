package ru.job4j.oop;

public class Plane implements Vehicle{
   @Override
    public void move() {
        String name = "Kate";
        System.out.println(name + " выбрала вид транспорта - " + getClass().getSimpleName());
    }

    public void speed() {
       int speed = 250;
            System.out.println("Скорость самолета = " + speed + " км/ч");
        }
    }

