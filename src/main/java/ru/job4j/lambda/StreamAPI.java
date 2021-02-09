package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-2);
        list.add(8);
        list.add(12);
        list.add(0);
        list.add(-72);
        list.add(100);

        List<Integer> result = list.stream().filter(l -> l < 0).collect(Collectors.toList());
        System.out.println(result);

    }
}
