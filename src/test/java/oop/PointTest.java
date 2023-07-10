package oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    public PointTest() {
    }

    @Test
    public void when00to20then2() {
        double expected = 4.24;
        Point point1 = new Point(2, 3, 1);
        Point point2 = new Point(5, 6, 8);

        double out = point2.distance(point1);
        Assert.assertEquals((double) expected, out, 0.01D);
    }
    @Test
    public void when00to20then3() {
        double expected = 9.94;
        Point point1 = new Point(2, 3, 1);
        Point point2 = new Point(5, 6, 8);

        double out = point2.distance3d(point1);
        Assert.assertEquals((double) expected, out, 0.01D);
    }
}