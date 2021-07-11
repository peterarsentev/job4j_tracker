package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to04then4() {
        double expected = 4.24;
        Point a = new Point(3, 1);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when001to020then223() {
        double expected = 2.23;
        Point a3D = new Point(0, 0, 1);
        Point b3D = new Point(0, 2, 0);
        double out = a3D.distance3d(b3D);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to214then1() {
        double expected = 3.16;
        Point a3D = new Point(1, 1, 1);
        Point b3D = new Point(2, 1, 4);
        double out = a3D.distance3d(b3D);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when310to042then4() {
        double expected = 4.69;
        Point a3D = new Point(3, 1, 0);
        Point b3D = new Point(0, 4, 2);
        double out = a3D.distance3d(b3D);
        Assert.assertEquals(expected, out, 0.01);
    }
}