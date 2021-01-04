package ru.job4j.inheritance;

public class Diagnosis {

    private int numberOfDocument;
    private byte day;
    private byte month;
    private byte year;
    private String heal;
    private String aspectDiagnosis;

    public Diagnosis() {
    }

    public Diagnosis(int numberOfDocument, byte day, byte month, byte year) {
    }

    public void setNumberOfDocument(int numberOfDocument) {
        this.numberOfDocument = numberOfDocument;
    }

    public void setAspectDiagnosis(String aspectDiagnosis) {
        this.aspectDiagnosis = aspectDiagnosis;
    }

    public int getNumberOfDocument() {
        return numberOfDocument;
    }

    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public byte getYear() {
        return year;
    }

    public String getHeal() {
        return heal;
    }

    public String getAspectDiagnosis() {
        return aspectDiagnosis;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    public void setHeal(String heal) {
        this.heal = heal;
    }
}
