package ru.job4j.oop.inheritance.profession;

public class Builder extends Engineer {
    private int build;

    public Builder(String name, String surname, String education,
                   String birthday, boolean allowance, int build) {
        super(name, surname, education, birthday, allowance);
        this.build = build;
    }
}
