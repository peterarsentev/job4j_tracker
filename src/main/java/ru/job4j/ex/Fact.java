package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        new Fact().calc(-2);
    }

    public int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Argument n < 0");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}