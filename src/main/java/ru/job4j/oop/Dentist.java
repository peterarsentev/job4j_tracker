package ru.job4j.oop;

public class Dentist extends Doctor {
    private String pacient;

    public Dentist(String pacient, String timeWork, String name, String surname, String education, String birthday) {
        super(timeWork, name, surname, education, birthday);
        this.pacient = pacient;
    }

    public String whoPacient() {
        return pacient;
    }
}