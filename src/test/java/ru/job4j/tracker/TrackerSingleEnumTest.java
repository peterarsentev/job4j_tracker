package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleEnumTest {

    @Test
    public void singleTest() {
        Tracker single1 = TrackerSingleEnum.SINGLE_ENUM.showTracker();
        Tracker single2 = TrackerSingleEnum.SINGLE_ENUM.showTracker();
        assertEquals(single1, single2);
    }
}