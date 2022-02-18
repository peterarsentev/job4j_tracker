package ru.job4j.lambda;

import org.junit.Test;
import ru.job4j.lambda.Diaposon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.Math.pow;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DiaposonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diaposon.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenSquareResults() {
        List<Double> result = Diaposon.diapason(5, 8, x -> x * x + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenDemonstrationResults() {
        List<Double> result = Diaposon.diapason(5, 8, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(33D, 65D, 129D);
        assertThat(result, is(expected));
    }
}