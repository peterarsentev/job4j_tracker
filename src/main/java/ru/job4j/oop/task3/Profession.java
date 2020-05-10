package ru.job4j.oop.task3;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEducation(){
        return education;
    }

    public String getBirthday(){
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
