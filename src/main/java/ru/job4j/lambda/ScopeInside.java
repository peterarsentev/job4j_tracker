package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int total = 0;
        for (int num : number) {
            int tmp = total;
            total = add(() -> tmp + num);

        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}