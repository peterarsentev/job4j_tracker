package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        wolf.tryEat(ball);
        fox.tryEat(ball);
        hare.tryEat(ball);
        ball.tryEat(ball);
    }
}