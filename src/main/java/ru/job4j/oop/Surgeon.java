package ru.job4j.oop;

public class Surgeon extends Doctor{
    private String howHospital;

    public Surgeon(String howHospital, String timeWork, String name, String surname, String education, String birthday) {
        super(timeWork, name, surname, education, birthday);
        this.howHospital = howHospital;
    }

    public String how() {
        return howHospital;
    }
}