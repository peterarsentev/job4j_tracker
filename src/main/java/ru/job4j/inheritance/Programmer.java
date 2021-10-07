package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private String programmingLanguage;
    public Programmer(String name, String surname, String education, int birthday, String cityOfResidence, String programmingLanguage) {
        super(name, surname, education, birthday, cityOfResidence);
        this.programmingLanguage = programmingLanguage;
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
