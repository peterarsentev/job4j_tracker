package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private Patient patient;
    private String specialization;

    public Surgeon(String name, String surname, String education,
                   String birthday, String hospital, String specialization) {
        super(name, surname, education, birthday, hospital);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void operate(Patient patient) {
    }
}
