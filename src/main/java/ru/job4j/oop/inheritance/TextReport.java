package ru.job4j.oop.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        System.out.println(jsonReport.generate("John", "Body"));
    }
}
