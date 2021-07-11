package ru.job4j.oop;

public class Builder extends Engineer {
    private String whatBuildings;

    public Builder(String whatBuildings, String howUniversity, String name, String surname, String education, String birthday) {
        super(howUniversity, name, surname, education, birthday);
        this.whatBuildings = whatBuildings;
    }

    public String whatBuild() {
        return whatBuildings;
    }
}