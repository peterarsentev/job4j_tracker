package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest  {
    @Test(expected = IllegalArgumentException.class)
    public void whenNumberLess0() {
        Fact.calc(-1);
    }

    @Test()
    public void whenNumberEqual0() {
        assertThat(Fact.calc(0), is(1));
    }

    @Test()
    public void whenNumberMore0() {
        assertThat(Fact.calc(10), is(3628800));
    }
}