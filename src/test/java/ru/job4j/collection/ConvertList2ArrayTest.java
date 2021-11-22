package ru.job4j.collection;

import java.util.Arrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when4ElementsThen4() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4), 2);
        int[][] expect = {
                {1, 2},
                {3, 4}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when9ElementsThen12() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 4);
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 0, 0}
        };
        assertThat(result, is(expect));
    }
}