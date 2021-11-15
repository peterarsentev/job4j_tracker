package ru.job4j.stream;

import org.junit.Test;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixTest {
    @Test
    public void matrixToList() {
        Integer[][] array = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix = new Matrix();
        List<Integer> rsl = matrix.convert(array);
        List<Integer> extended = List.of(1, 2, 3, 4, 5, 6);
        assertThat(rsl, is(extended));
    }

    @Test
    public void matrixToListTwo() {
        Integer[][] array = {{1, 2}, {3, 4}, {5, 6}};
        Matrix matrix = new Matrix();
        List<Integer> rsl = matrix.convert(array);
        List<Integer> extended = List.of(1, 2, 3, 4, 5, 6);
        assertThat(rsl, is(extended));
    }
}
