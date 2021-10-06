package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThenZero() {
        Fact.calc(-1);
    }

    @Test
    public void whenNMoreThanZero() {
        int result = Fact.calc(3);
        assertThat(result, is(6));
    }
}