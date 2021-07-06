package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        final String nameStr = "{" + System.lineSeparator() + "\t\"name\" : " + "\"" + name + "\",";
        final String bodyStr = "\t\"body\": " + "\"" + body + "\"" + System.lineSeparator() + "}";
        return nameStr + System.lineSeparator() + bodyStr;
    }
}
