package ru.job4j.it;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class EvenIt {
    private final int[] data;
    private int point;

    public EvenIt(final int[] numbers) {
        data = numbers;
    }

    public int next() { //- возвращают только четные числа. В этом примере - это 4 и 2.
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int temp = data[iter(point)];
        point = iter(point) + 1;
        return temp;
    }

    public boolean hasNext() {
        return (point < data.length) && (iter(point) != -1);
    }

    private int iter(int g) {
        int peso = -1;
        for (int i = g; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                peso = i;
                break;
            }
        }
        return peso;
    }
}
