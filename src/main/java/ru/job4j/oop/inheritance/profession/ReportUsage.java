package ru.job4j.oop.inheritance.profession;

import ru.job4j.oop.inheritance.JSONReport;
import ru.job4j.oop.inheritance.TextReport;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
