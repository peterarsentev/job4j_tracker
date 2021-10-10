package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport{
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" +
                "<br/>" +
                "<span>" + body + "</span>";
    }
}
