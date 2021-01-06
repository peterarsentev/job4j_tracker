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
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
    }

    public Profession(String education, byte specialization, byte experience) {
        this.education = education;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public byte getSpecialization() {
        return specialization;
    }

    public void setSpecialization(byte specialization) {
        this.specialization = specialization;
    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }
}