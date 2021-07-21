package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(65, 21);
        assertThat(result, is(65));
    }

    @Test
    public void when1Equally2Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1To2And3Then1() {
        int result = Max.max(10, 2, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax2To1And3And4Then2() {
        int result = Max.max(65, 211, 15, 100);
        assertThat(result, is(211));
    }
}