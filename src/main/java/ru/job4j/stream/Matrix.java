package ru.job4j.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public List<Integer> collect(List<List<Integer>> matrix) {
          return matrix.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
