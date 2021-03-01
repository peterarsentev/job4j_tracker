package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, Date birthday, Pacient pacient,
                   String diagnos, Tool tool) {
        super(name, surname, education, birthday, pacient, diagnos, tool);
    }

    public void operation(Pacient pacient, Tool tool) {

    }
}
