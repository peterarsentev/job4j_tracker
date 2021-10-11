package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport{


    @Override
    public String generate(String name, String body) {
        char dm = (char) 34;
        return "{" + System.lineSeparator() +
                "  \"name\" : " + "\"" + name + "\"," + System.lineSeparator() +
                "  \"body\" : " + "\"" + body + "\"" + System.lineSeparator() +
                "}";
    }

}
