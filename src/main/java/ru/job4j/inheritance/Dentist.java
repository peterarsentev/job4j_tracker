package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {
    private Teeth teeth;

    public Dentist(String name, String surname, String education, Date birthday, Pacient pacient,
                   String diagnos, Teeth teeth) {
        super(name, surname, education, birthday, pacient, diagnos);
        this.teeth = teeth;
    }

    public void dental(Teeth teeth, Pacient pacient) {

    }

}
