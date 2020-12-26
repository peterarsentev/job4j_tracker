package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        hare.tryEat(ball);
        ball.tryLeave(hare);
        wolf.tryEat(ball);
        ball.tryLeave(wolf);
        fox.tryEat(ball);
        ball.eat(fox);
    }
}
