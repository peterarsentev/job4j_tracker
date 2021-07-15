package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return  " ____" + ln
                + "|    |" + ln
                + "|    |" + ln
                + " ____" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}
