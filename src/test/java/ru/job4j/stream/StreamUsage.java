package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 6, 8, 5, 77, 98, 3, 11, 44, 74);
        List<Integer> listFilter = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        listFilter.forEach(System.out::println);
    }
}
