package ru.job4j.inheritance;

public class Doctor extends Profession {
    private Pacient pacient;
    private String diagnos;
    private Tool tool;

    public String diagnosis(Pacient pacient) {
        return diagnos;
    }

    public void healing(Pacient pacient) {

    }


}
