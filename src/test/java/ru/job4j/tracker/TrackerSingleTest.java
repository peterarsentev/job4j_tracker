package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleTest {

    @Test
    public void testSingle() {
        Tracker tracker = TrackerSingle.getInstance();
        Tracker tracker2 = TrackerSingle.getInstance();
        assertEquals(tracker, tracker2);
    }
}