package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        return condition ? left : right;
    }

        public static int max(int left, int right, int third) {
            return max(left, max(right, third));
        }

        public static int max(int left, int right, int third, int four) {
            return max(four, max(left, max(right, third)));
        }
    }