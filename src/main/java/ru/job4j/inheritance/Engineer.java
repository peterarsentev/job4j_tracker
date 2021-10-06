package ru.job4j.inheritance;

public class Engineer extends Profession {
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

    private String cityOfResidence;

    public String getCityOfResidence() {
        return cityOfResidence;
    }

}
