package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String leftNum = "";
        String rightNum = "";
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            if (left.charAt(i) > 47 && left.charAt(i) < 58) {
                leftNum += String.valueOf(left.charAt(i));
            }
            if (left.charAt(i) == 46) {
                leftNum += " ";
            }
            if (right.charAt(i) > 47 && right.charAt(i) < 58) {
                rightNum += String.valueOf(right.charAt(i));
            }
            if (right.charAt(i) == 46) {
                rightNum += " ";
            }
        }

        String[] leftNumbers = leftNum.split(" ");
        String[] rightNumbers = rightNum.split(" ");

         for(int i = 0; i < Math.min(leftNumbers.length, rightNumbers.length); i++) {
            if (Integer.parseInt(leftNumbers[i]) > Integer.parseInt(rightNumbers[i])) {
                return 1;
            } else if (Integer.parseInt(leftNumbers[i]) < Integer.parseInt(rightNumbers[i])) {
                return -1;
            }
        }
        return 0;
    }
}
