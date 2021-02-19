package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public List<Integer> collect(Integer[][] matrix) {
        return Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
