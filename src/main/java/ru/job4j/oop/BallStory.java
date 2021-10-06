package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball yellow = new Ball();
        Hare rabbit = new Hare();
        Wolf wolfling = new Wolf();
        Fox redhead = new Fox();

        rabbit.tryEat(yellow);
        wolfling.tryEat(yellow);
        redhead.tryEat(yellow);
    }
}
