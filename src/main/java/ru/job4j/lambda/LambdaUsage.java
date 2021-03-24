package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("book 2", "book 3", "book 1");
        List<String> list2 = Arrays.asList("book", "bo", "book123");

        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return left.compareTo(right);
        };
        list.sort(cmpText);
        System.out.println(list);

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };
        list2.sort(cmpDescSize);
        System.out.println(list2);
    }
}
