package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        hare.tryEat(ball);
        ball.song();
        ball.run();
        wolf.tryEat(ball);
        ball.song();
        ball.run();
        fox.tryEat(ball);
        ball.song();
        ball.song();
        ball.death();
    }

}
