package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest  {

    @Test
    public void testDistance1() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(4, 0.001));
    }

    @Test
    public void testDistance11() {
        Point a = new Point(-2, 0);
        Point b = new Point(4, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(6, 0.001));
    }

    @Test
    public void testDistance2() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double rsl = b.distance3d(a);
        assertThat(rsl, closeTo(4, 0.001));
    }

    @Test
    public void testDistance3() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double rsl = b.distance(a);
        assertThat(rsl, closeTo(4, 0.001));
    }
}