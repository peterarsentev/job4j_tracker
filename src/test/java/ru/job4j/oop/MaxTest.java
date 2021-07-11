package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5() {
        int left = 1;
        int right = 2;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7() {
        int left = 3;
        int right = 2;
        int third = 7;
        int four = 4;
        int result = Max.max(left, right, third, four);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

} 