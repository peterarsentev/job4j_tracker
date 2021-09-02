package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {
    @Test
    public void whenA00B02thenDist2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2, 0.001));
    }

    @Test
    public void whenA56B09thenDist5831() {
        Point a = new Point(5, 6);
        Point b = new Point(0, 9);
        double dist = a.distance(b);
        assertThat(dist, closeTo(5.831, 0.001));
    }

    @Test
    public void whenA24B33thenDist1414() {
        Point a = new Point(2, 4);
        Point b = new Point(3, 3);
        double dist = a.distance(b);
        assertThat(dist, closeTo(1.414, 0.001));
    }
}
