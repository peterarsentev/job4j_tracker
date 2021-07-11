package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void areaOne() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void areaTwo() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(1, 0.001));
    }

    @Test
    public void areaThree() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 6);
        Point c = new Point(25, 7);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(34, 0.001));
    }

    @Test
    public void areaFour() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Point c = new Point(1, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(-1, 0.001));
    }
}