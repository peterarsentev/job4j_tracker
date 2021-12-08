package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest{

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberIsNagative() {
        Fact.calc(-10);
    }

    @Test
    public void whenNumberIsPositive() {
        int rsl = Fact.calc(5);;
        assertThat(rsl, is(120));
    }

    @Test
    public void whenNumberIsZiro() {
        int rsl = Fact.calc(0);;
        assertThat(rsl, is(1));
    }


}