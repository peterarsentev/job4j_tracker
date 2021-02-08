package ru.job4j.lambda;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

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
        List<Double> result = Lambda.calculate(5, 8, x -> (-2 * -2) - 4 * x * 3);
        List<Double> expected = Arrays.asList(-56D, -68D, -80D);
        assertThat(result, Is.is(expected));
    }

    @Test
    public void whenPokazatelnayaFunctionThenPokazatelniyResult() {
        List<Double> result = Lambda.calculate(5, 8, Math::exp);
        List<Double> expected = Arrays.asList(148.4131591025766, 403.4287934927351, 1096.6331584284585);
        assertThat(result, Is.is(expected));
    }
}
