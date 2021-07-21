package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenPoint2toPoint2then22() {
        Point a = new Point(1, 2);
        Point b = new Point(7, 24);
        double out = a.distance(b);
        double expected = 22.80;
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenPoint3toPoint3then33() {
        Point a = new Point(1, 2, 2);
        Point b = new Point(7, 14, 2);
        double out3d = a.distance3d(b);
        double expected = 13.42;
        Assert.assertEquals(expected, out3d, 0.01);

    }
}