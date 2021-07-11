package ru.job4j.oop;

public class Programmer extends Engineer{
    private int experience;

    public Programmer(int experience, String howUniversity, String name, String surname, String education, String birthday) {
        super(howUniversity, name, surname, education, birthday);
        this.experience = experience;
    }

    public int howMuchWork() {
        return experience;
    }
}