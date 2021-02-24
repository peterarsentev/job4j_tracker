package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String name) {
        desc = name;
    }

    public static void main(String[] args) {
        String temp = "Good Luck";
        Fix first = new Fix(temp);
    }
}
