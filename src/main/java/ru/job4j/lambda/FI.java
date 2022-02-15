package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        String[] atts = {"imageA", "imageMN"};
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) ->
                Integer.compare(right.length(), left.length());
        Arrays.sort(atts, cmpText);
        for (String i: atts) {
            System.out.println(i);
        }
        Arrays.sort(atts, cmpDescSize);
        for (String i: atts) {
            System.out.println(i);
        }
    }
}
