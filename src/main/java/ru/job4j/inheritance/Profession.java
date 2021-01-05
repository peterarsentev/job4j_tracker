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

    public Profession(String name, String education, byte specialization, byte experience) {
        this.name = name;
        this.education = education;
        this.specialization = specialization;
        this.experience = experience;
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

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    public String setEducation(String education) {
        this.education = education;
        return education;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String setSurname() {
        return surname;
    }

    protected String setEducation() {
        return education;
    }
}