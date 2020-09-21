package ru.job4j.lambda;

import java.util.Comparator;

public class Stroki {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) ->
                left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(left.length(), right.length());
        };
    }
}
