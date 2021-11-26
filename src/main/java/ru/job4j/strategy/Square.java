package ru.job4j.strategy;

public class Square implements Shape{
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "  ----------" + ln
                + " |           | " + ln
                + " |           | " + ln
                + " |           | " + ln
                + "  ----------" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}
