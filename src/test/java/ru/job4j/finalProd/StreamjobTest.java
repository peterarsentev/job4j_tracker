package ru.job4j.finalProd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StreamjobTest {

    @Test
    public void firstof() {
        List<Integer> rsl = (List<Integer>) Streamjob.of(2, 5, 1, 8).filter(e -> (int) e < 6).collect("List");
        assertEquals(List.of(2, 5, 1), rsl);
    }
}