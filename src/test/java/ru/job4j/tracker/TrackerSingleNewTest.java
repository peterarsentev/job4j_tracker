package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;

public class TrackerSingleNewTest {

    @Test
    public void getInstanceTest() {
        TrackerSingleNew tracker = TrackerSingleNew.getInstance();
        TrackerSingleNew tracker2 = TrackerSingleNew.getInstance();
        assertThat(tracker, is(tracker2));
    }
}