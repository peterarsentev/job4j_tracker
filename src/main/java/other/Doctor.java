package other;

public class Doctor extends Profession {

    private String special;

    public Doctor(String surName, String name, String education, int birthday, String special) {
        super(surName, name, education, birthday);
        this.special = special;
    }

    public Diagnosis heal(Pacient pacient) {

        return d;
    }
}
