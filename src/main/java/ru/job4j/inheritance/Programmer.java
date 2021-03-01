package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {
    private BD bd;
    private Computer computer;
    private Frameworks frameworks;

    public Programmer(String name, String surname, String education, Date birthday, Project project, String task, BD bd,
                      Computer computer, Frameworks frameworks) {
        super(name, surname, education, birthday, project, task);
        this.bd = bd;
        this.computer = computer;
        this.frameworks = frameworks;
    }

    public BD creatBD(String task, BD oldBd) {
        return bd;
    }
}
