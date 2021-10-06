package ru.job4j.inheritance;

public class Doctor extends Profession{
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

    private int bodCheck;

    public int getBodCheck() {
        return bodCheck;
    }

}
