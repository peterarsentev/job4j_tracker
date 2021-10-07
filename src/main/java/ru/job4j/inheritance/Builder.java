package ru.job4j.inheritance;

public class Builder extends Engineer{
    private String typeOfWork;
    public Builder(String name, String surname, String education, int birthday, String cityOfResidence, String typeOfWork) {
        super(name, surname, education, birthday, cityOfResidence);
        this.typeOfWork = typeOfWork;
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
