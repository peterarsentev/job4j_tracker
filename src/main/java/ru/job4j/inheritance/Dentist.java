package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String workTime;
    private Patient patient;

    public Dentist(String name, String surname, String education,
                   String birthday, String hospital, String workTime) {
        super(name, surname, education, birthday, hospital);
        this.workTime = workTime;
    }

    public String getWorkTime() {
        return workTime;
    }

    public String makeAppointment(Patient patient) {
        return workTime;
    }
}
