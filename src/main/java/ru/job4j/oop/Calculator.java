package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + minus(num) + multiply(num) + divide(num);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = sum(10);
        int resultMinus = minus(28);
        int resultMult = calculator.multiply(5);
        int resultDiv = calculator.divide(10);
        int result = calculator.sumAllOperation(7);
        System.out.println(resultSum);
        System.out.println(resultMinus);
        System.out.println(resultMult);
        System.out.println(resultDiv);
        System.out.println(result);
    }
}
