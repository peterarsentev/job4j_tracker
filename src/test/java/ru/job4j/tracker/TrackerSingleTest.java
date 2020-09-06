package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleTest {

    @Test
    public void testSingle() {
        TrackerSingle tracker = TrackerSingle.getInstance();
        TrackerSingle tracker2 = TrackerSingle.getInstance();
        assertTrue(tracker.equals(tracker2));
    }
}