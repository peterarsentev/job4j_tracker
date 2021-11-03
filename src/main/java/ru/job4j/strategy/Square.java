package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        StringBuilder square = new StringBuilder();
        final int SIZE_RECT = 5;
        for (int j = 0; j < SIZE_RECT; j++) {
            for (int i = 0; i < SIZE_RECT; i++) {
                if (j == 0 || j == SIZE_RECT - 1 || i == 0 || i == SIZE_RECT - 1) {
                    square.append('*');
                } else {
                    square.append(" ");
                }
            }
            square.append(ln);
        }
        return square.toString();
    }
}
