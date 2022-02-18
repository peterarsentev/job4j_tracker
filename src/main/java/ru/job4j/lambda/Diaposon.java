package ru.job4j.lambda;

import ru.job4j.function.Folder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diaposon {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }
}
