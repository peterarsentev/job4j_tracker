package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        int index = 0;
        for (int[] row : list) {
            for (Integer cell : row) {
                rsl.add(index, cell);
                index++;
            }
        }
        return rsl;
    }
}
