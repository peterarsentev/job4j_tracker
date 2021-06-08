package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {

    public List<Integer> matrixConvert(Integer[][] array) {
        return Arrays.stream(array).
                flatMap(e -> Arrays.stream(e.clone())).
                collect(Collectors.toList());
    }
}

