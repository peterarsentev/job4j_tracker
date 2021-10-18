package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String cityOfResidence;

    public Engineer(String name, String surname, String education,
                    int birthday, String cityOfResidence) {
        super(name, surname, education, birthday);
        this.cityOfResidence = cityOfResidence;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
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
