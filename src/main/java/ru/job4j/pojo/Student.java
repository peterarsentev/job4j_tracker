package ru.job4j.pojo;

public class Student {
    private String name;
    private String surName;
    private String faculty;
    private int numOfGroup;
    private String incomingToStudy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getNumOfGroup() {
        return numOfGroup;
    }

    public void setNumOfGroup(int numOfGroup) {
        this.numOfGroup = numOfGroup;
    }

    public String getIncomingToStudy() {
        return incomingToStudy;
    }

    public void setIncomingToStudy(String incomingToStudy) {
        this.incomingToStudy = incomingToStudy;
    }
}
