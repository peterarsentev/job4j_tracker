package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void ifTriangleExist() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(8, 0.001));
    }

    @Test
    public void ifTriangleNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(3, 9);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, result, 0.01);
    }
}
