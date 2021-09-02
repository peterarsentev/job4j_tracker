package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void maxForTwoNumbers() {
        int first = 5;
        int second = 3;
        int result = 5;
        int expected = Max.max(first, second);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxForThreeNumbers() {
        int first = 8;
        int second = 4;
        int third = 10;
        int result = 10;
        int expected = Max.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMaxForFourNumbers() {
        int first = 6;
        int second = 22;
        int third = 12;
        int fourth = 5;
        int result = 22;
        int expected = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }
}