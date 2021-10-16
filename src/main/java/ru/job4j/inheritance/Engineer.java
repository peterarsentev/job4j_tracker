package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {
    private Project project;
    private String task;

    public Engineer(String name, String surname, String education, Date birthday, Project project) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public Project creatProject(String task) {
        return project;
    }
}
