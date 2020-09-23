package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void test1() {
        int[][] in = {{1, 2}, {1, 2}};
        List<Integer> exp = List.of(1, 2, 1, 2);
        assertEquals(exp, MatrixToList.recycle(in));
    }

    @Test
    public void testIfZero() {
        int[][] in = {{0, 0}, {0, 0}};
        List<Integer> exp = List.of(0, 0, 0, 0);
        assertEquals(exp, MatrixToList.recycle(in));
    }

    @Test
    public void testIfNatural() {
        int[][] in = {{1, 2}, {3, 4}};
        List<Integer> exp = List.of(1, 2, 3, 4);
        assertEquals(exp, MatrixToList.recycle(in));
    }
}