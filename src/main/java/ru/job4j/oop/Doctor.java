package ru.job4j.oop;

public class Doctor extends Profession {
    private String timeWork;

    public Doctor(String timeWork, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.timeWork = timeWork;
    }

    public String howMuch() {
        return timeWork;
    }
}