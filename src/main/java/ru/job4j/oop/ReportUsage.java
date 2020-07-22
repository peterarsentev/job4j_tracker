package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {

        TextReport report1 = new TextReport();
        String text1 = report1.generate("Report's name", "Report's body");
        System.out.println(text1+System.lineSeparator());

        HtmlReport report2 = new HtmlReport();
        String text2 = report2.generate("Report's name", "Report's body");
        System.out.println(text2+System.lineSeparator());

        JsonReport report3 = new JsonReport();
        String text3 = report3.generate("Report's name", "Report's body");
        System.out.println(text3+System.lineSeparator());
    }
}
