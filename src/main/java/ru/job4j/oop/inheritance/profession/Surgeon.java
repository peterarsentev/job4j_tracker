package ru.job4j.oop.inheritance.profession;

public class Surgeon extends Doctor {
    private int surg;

    public Surgeon(String name, String surname, String education,
                   String birthday, int experience, int surg) {
        super(name, surname, education, birthday, experience);
        this.surg = surg;
    }

}
