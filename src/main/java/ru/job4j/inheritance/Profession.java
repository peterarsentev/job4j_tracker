package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;
    private int salary;
    private byte specialization;
    private byte experience;

    public Profession() {
    }

    public Profession(String name, String surname, int birthday, int salary) {
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }

    public byte getExperience() {
        return experience;
    }

    public byte getSpecialization() {
        return specialization;
    }

    public void setSpecialization(byte specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
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

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}