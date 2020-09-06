package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleEnumTest {

    @Test
    public void singleTest() {
        TrackerSingleEnum single1 = TrackerSingleEnum.SINGLE_ENUM;
        TrackerSingleEnum single2 = TrackerSingleEnum.SINGLE_ENUM;
        assertEquals(single1, single2);
    }
}