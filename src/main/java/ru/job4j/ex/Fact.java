package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be more or equal 0");
        }
        int rsl = 1;
        for (int index = 0; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
