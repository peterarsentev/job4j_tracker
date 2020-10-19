package ru.job4j.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void initial() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(43);
        list.add(4);
        for (Integer integer : list) {
            System.out.println(integer.toString());
        }
        System.out.println(list.get(0));
    }
}