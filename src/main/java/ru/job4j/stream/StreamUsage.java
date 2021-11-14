package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(11);
        list1.add(-4);
        list1.add(0);
        list1.add(9);
        list1.add(1);
        list1.add(-7);
        List<Integer> list2 = list1.stream().
                filter(element -> element > 0).collect(Collectors.toList());
        System.out.println(list2);
    }
}
