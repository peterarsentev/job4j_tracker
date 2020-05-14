package ru.job4j.validate;

public class DivByZero {
    public static int div(int first, int second) {
        int rsl = -1;
        if (second == 0) {
            System.out.println("Div by 0, return def value -1");
        } else {
            rsl = first / second;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = div(10, 0);
        System.out.println(rsl);
    }
}
