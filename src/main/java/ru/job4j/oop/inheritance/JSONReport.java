package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "\t\"name\" : " + "\"" + name + "\","
                + System.lineSeparator() + "\t\"body\": " + "\""
                + body + "\"" + System.lineSeparator() + "}";
    }
}
