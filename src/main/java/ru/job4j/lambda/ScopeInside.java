package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    static private int total = 0;

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            total = add(() -> total + num);

        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}