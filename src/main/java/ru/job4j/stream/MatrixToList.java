package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public static void main(String[] args) {
        int[][] integers = {{1, 4}, {1, 5, 6}};
        List<Integer> recycle = Arrays.stream(integers)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
        recycle.forEach(System.out::println);
    }
}
