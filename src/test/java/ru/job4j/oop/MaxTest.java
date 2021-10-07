package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void testMax2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax2equal() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax3() {
        int a = 1;
        int b = 2;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax4equal() {
        int a = 1;
        int b = 2;
        int c = 0;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}



