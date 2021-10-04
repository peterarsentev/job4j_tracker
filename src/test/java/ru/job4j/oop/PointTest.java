package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {


    @Test
    public void when000to020then2() {
        double expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.00001);
    }

    @Test
    public void when111to036then5Dot47() {
        double expected = 5.4772255;
        Point a = new Point(1, 1, 1);
        Point b = new Point(0, 3, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.00001);
    }

    @Test
    public void when302to725then5Dot38() {
        double expected = 5.38516;
        Point a = new Point(3, 0, 2);
        Point b = new Point(7, 2, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.00001);
    }
}