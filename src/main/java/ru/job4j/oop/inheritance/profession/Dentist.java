package ru.job4j.oop.inheritance.profession;

public class Dentist extends Doctor {
    private int dent;

    public Dentist(String name, String surname, String education,
                   String birthday, int experience, int dent) {
        super(name, surname, education, birthday, experience);
        this.dent = dent;
    }
}
