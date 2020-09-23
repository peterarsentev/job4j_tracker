package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Intel {
    public static void main(String[] args) {
        List<Integer> listik = new ArrayList<Integer>();
        listik = List.of(1, 50, 4, 6, 3, 8, 15, -5, -18);
        List<Integer> positive = listik
                .stream()
                .filter(el -> el > 0)
                .collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
