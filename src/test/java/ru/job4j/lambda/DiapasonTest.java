package ru.job4j.lambda;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 3);
        List<Double> expected = Arrays.asList(13D, 15D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(2, 5, x -> x * x + 4);
        List<Double> expected = Arrays.asList(8D, 13D, 20D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenPowResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(1, 5, x -> Math.pow(3, x) - 7);
        List<Double> expected = Arrays.asList(-4D, 2D, 20D, 74D);
        assertThat(result, is(expected));
    }
}
