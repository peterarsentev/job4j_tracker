package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertList2Array.toArray(
                List.of(9, 8, 7, 6, 5, 4, 3),
                3
        );
        int[][] expect = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 0, 0}
        };
        assertThat(result, is(expect));
    }
}