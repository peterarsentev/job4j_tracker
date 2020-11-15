package ru.job4j.collection;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SimpleSetTest {
    @Test
    public void testNumOne() {
        SimpleSet<Integer> set = new SimpleSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        set.forEach(System.out::println);
    }
}