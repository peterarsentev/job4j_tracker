package ru.job4j.oop;

public class Engineer extends Profession {
    private String howUniversity;

    public Engineer(String howUniversity, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.howUniversity = howUniversity;

    }

    public String university() {
        return howUniversity;
    }
}