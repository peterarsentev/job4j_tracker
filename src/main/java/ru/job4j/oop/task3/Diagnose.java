package ru.job4j.oop.task3;

public class Diagnose extends Doctor {

    private static Diagnose diagnose;

    private String treatment;

    public static Diagnose getDiagnose() {
        return diagnose;
    }

    public static void setDiagnose(Diagnose diagnose) {
        Diagnose.diagnose = diagnose;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
