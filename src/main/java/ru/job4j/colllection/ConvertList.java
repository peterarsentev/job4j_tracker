package ru.job4j.colllection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
        public static List<Integer> convert(List<int[]> list) {
            List<Integer> rsl = new ArrayList<>();
            for (int[] ints : list) {
                for (int anInt : ints) {
                    rsl.add(anInt);
                }
            }
            return rsl;
        }
}
