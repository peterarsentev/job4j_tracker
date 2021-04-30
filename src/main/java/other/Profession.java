package other;

public class Profession {

    protected String surName;
    protected String name;
    protected String education;
    protected int birthday;

    public Profession(String surName, String name, String education, int birthday) {
        this.surName = surName;
        this.name = name;
        this.education = education;
        this.birthday = birthday;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}
