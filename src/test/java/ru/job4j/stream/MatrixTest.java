package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void collect() {
        Integer[][] matrix = new Integer[][] {{1, 2}, {3, 4}};
        Matrix m = new Matrix();
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertThat(expected, is(m.collect(matrix)));
    }
}
