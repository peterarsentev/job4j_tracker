package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private int numberOfOperations;
    public Surgeon(String name, String surname, String education, int birthday, int bodCheck, int numberOfOperations) {
        super(name, surname, education, birthday, bodCheck);
        this.numberOfOperations = numberOfOperations;
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
