package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {
    private BD bd;
    private Computer computer;
    private Frameworks frameworks;

    public Programmer(String name, String surname, String education, Date birthday, Project project, Computer computer) {
        super(name, surname, education, birthday, project);
        this.computer = computer;
    }

    public BD creatBD(String task, BD oldBd, Frameworks frameworks) {
        return bd;
    }
}
