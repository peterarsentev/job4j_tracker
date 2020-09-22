package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Method {
    static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<Double>();
        for (int i = start; i < end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
