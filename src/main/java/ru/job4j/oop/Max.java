package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return  first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return  max(first,second) > third ? max(first,second) : third;
    }

    public static int max(int first, int second, int third, int fourthly) {
        return  max(first,second) > max(first,fourthly) ? max(first,second) : max(first,fourthly);
    }
}
