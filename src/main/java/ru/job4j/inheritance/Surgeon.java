package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, Date birthday,
                   Pacient pacient, String diagnos) {
        super(name, surname, education, birthday, pacient, diagnos);
    }

    public void operation(Pacient pacient, Tool tool) {

    }
}
