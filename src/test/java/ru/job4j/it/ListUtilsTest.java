package ru.job4j.it;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertThat;

public class ListUtilsTest {

    @Test
    public void whenAddBefore() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
        ListUtils.addBefore(input, 1, 2);
        assertThat(Arrays.asList(1, 2, 3), Is.is(input));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenAddBeforeWithInvalidIndex() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
        ListUtils.addBefore(input, 3, 2);
    }

    @Test
    public void addAfter() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
        ListUtils.addAfter(input, 1, 2);
        assertThat(Arrays.asList(1, 3, 2), Is.is(input));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenAddAfterWithInvalidIndex() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3));
        ListUtils.addBefore(input, 3, 2);
    }

    @Test
    public void testRemoveIf() {
        Predicate<Integer> filter = x -> {
            return x > 8;
        };
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 10));
        ListUtils.removeIf(input, filter);
        assertThat(Arrays.asList(1, 3), Is.is(input));
    }

    @Test
    public void replaceMethodTest() {
        Predicate<Integer> filter = x -> {
            return x > 8;
        };
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 30, 3, 10));
        ListUtils.replaceIf(input, filter, 0);
        assertThat(Arrays.asList(1, 0, 3, 0), Is.is(input));
    }

    @Test
    public void removeAllTestMethod() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 30, 3, 10));
        List<Integer> elements = new ArrayList<>(Arrays.asList(30, 10));
        ListUtils.removeAll(input, elements);
        assertThat(Arrays.asList(1, 3), Is.is(input));
    }
}