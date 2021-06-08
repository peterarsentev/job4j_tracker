package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint contest = new Paint();
        contest.draw(new Triangle());
        contest.draw(new Square());
    }
}
