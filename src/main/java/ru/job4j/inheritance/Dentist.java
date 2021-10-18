package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String gender;

    public Dentist(String name, String surname, String education,
                   int birthday, int bodCheck, String gender) {
        super(name, surname, education, birthday, bodCheck);
        this.gender = gender;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public int getBirthday() {
        return super.getBirthday();
    }
}
