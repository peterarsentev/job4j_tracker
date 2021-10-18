package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int bodCheck;

    public Doctor(String name, String surname, String education, int birthday, int bodCheck) {
        super(name, surname, education, birthday);
        this.bodCheck = bodCheck;
    }

    public int getBodCheck() {
        return bodCheck;
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
