package ru.job4j.oop;
import java.util.Date;

public class Profession {

    private String name;
    private String surname;
    private Education education;
    private Date date;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Education getEducation() {
        return education;
    }

    public Date getDate() {
        return date;
    }
}

enum Education {
    MUSIC,
    TECH,
    HUMANITARY
}