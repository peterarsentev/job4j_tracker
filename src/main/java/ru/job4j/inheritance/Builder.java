package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {
    private Build build;
    private Tool tool;

    public Builder(String name, String surname, String education, Date birthday,
                   Project project, Build build) {
        super(name, surname, education, birthday, project);
        this.build = build;
    }

    public Build building(String task) {
        return build;
    }
}
