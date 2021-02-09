package ru.job4j.lambda;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

public class LambdaTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Lambda.calculate(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, Is.is(expected));
    }

    @Test
    public void whenQuarterFunctionThenQuarterResult() {
        List<Double> result = Lambda.calculate(5, 8, x -> (Math.pow(x, 2)) - 4 * 3 * 3);
        List<Double> expected = Arrays.asList(-11D, 0D, 13D);
        assertThat(result, Is.is(expected));
    }

    @Test
    public void whenPokazatelnayaFunctionThenPokazatelniyResult() {
        List<Double> result = Lambda.calculate(5, 8, x -> Math.floor(Math.pow(2.7182818284, x)));
        List<Double> expected = Arrays.asList(148D, 403D, 1096D);
        assertThat(result, Is.is(expected));
    }
}
