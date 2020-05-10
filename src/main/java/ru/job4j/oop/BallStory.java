package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();

        hare.runFromTryEat(ball);
        wolf.runFromTryEat(ball);
        fox.runFromTryEat(ball);
        ball.runFromTryEat(ball);
    }
}
