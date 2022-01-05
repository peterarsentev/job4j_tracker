package ru.job4j.oop.inheritance.profession;

public class Doctor extends Profession {
    private int experience;

    public Doctor(String name, String surname, String education,
                  String birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public void diagnosisHeal(Pacient pacient) {
    }
}
