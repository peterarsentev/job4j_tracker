package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {
    private Build build;
    private Tool tool;

    public Builder(String name, String surname, String education, Date birthday, Project project,
                   String task, Build build, Tool tool) {
        super(name, surname, education, birthday, project, task);
        this.build = build;
        this.tool = tool;
    }

    public Build building(String task) {
        return build;
    }
}
