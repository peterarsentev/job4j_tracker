package ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {
    private Pacient pacient;
    private String diagnos;
    private Tool tool;

    public Doctor(String name, String surname, String education, Date birthday,
                  Pacient pacient, String diagnos) {
        super(name, surname, education, birthday);
        this.pacient = pacient;
        this.diagnos = diagnos;
    }

    public String diagnosis(Pacient pacient) {
        return diagnos;
    }

    public void healing(Pacient pacient) {

    }
}
