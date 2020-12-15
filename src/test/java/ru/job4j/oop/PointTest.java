package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(2, out, 00.1);
    }

    @Test
    public void when20to21then2() {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(2, 1);
        double out = point1.distance(point2);
        Assert.assertEquals(1, out, 00.1);
    }

    @Test
    public void when010to220then2() {
        Point point1 = new Point(0, 1, 0);
        Point point2 = new Point(2, 2, 0);
        double out = point1.distance3d(point2);
        Assert.assertEquals(2.23606797749979, out, 00.1);
    }

    @Test
    public void when510to223then4() {
        Point point1 = new Point(5, 1, 0);
        Point point2 = new Point(2, 2, 3);
        double out = point1.distance3d(point2);
        Assert.assertEquals(4.358898943540674, out, 00.1);
    }
}