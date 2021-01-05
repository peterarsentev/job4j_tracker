package ru.job4j.inheritance;

public class Teacher extends Profession {
    private String educationAgency;
    private String educationalBoard;
    private String shorthandDictation;
    private String textbook;
    private String trainingTechnique;
    private String notebook;

    public Teacher() {
    }

    public Teacher teaching(Student student) {
        return null;
    }

    public String getName(String name) {
        return super.getName();
    }

    public String setName(String name) {
        return super.setName();
    }

    public String getEducationAgency() {
        return educationAgency;
    }

    public void setEducationAgency(String educationAgency) {
        this.educationAgency = educationAgency;
    }

    public String getEducationalBoard() {
        return educationalBoard;
    }

    public void setEducationalBoard(String educationalBoard) {
        this.educationalBoard = educationalBoard;
    }

    public String getShorthandDictation() {
        return shorthandDictation;
    }

    public void setShorthandDictation(String shorthandDictation) {
        this.shorthandDictation = shorthandDictation;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }

    public String getTrainingTechnique() {
        return trainingTechnique;
    }

    public void setTrainingTechnique(String trainingTechnique) {
        this.trainingTechnique = trainingTechnique;
    }

    public String getNotebook() {
        return notebook;
    }

    public void setNotebook(String notebook) {
        this.notebook = notebook;
    }
}
