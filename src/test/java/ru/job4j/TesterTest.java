package ru.job4j;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class TesterTest {
    @Test
    public void test() {
        Tester.User user1 = new Tester.User("C", 10);
        Tester.User user2 = new Tester.User("B", 20);
        Tester.User user3 = new Tester.User("A", 15);
        Tester.User user4 = new Tester.User("B", 11);
        Tester.User user5 = new Tester.User("A", 12);
        List<Tester.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<Tester.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(Tester.thenComparing());
        assertEquals(expect, input);
    }
}