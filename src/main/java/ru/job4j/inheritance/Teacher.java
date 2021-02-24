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

    public Teacher(String name, String surname, String education, int birthday, int salary, byte specialization, byte experience, String educationAgency, String educationalBoard, String shorthandDictation, String textbook, String trainingTechnique, String notebook) {
        super(name, surname, education, birthday, salary, specialization, experience);
        this.educationAgency = educationAgency;
        this.educationalBoard = educationalBoard;
        this.shorthandDictation = shorthandDictation;
        this.textbook = textbook;
        this.trainingTechnique = trainingTechnique;
        this.notebook = notebook;
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

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public void setEducation(String education) {
        super.setEducation(education);
    }

    @Override
    public int getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(int birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public byte getSpecialization() {
        return super.getSpecialization();
    }

    @Override
    public void setSpecialization(byte specialization) {
        super.setSpecialization(specialization);
    }

    @Override
    public byte getExperience() {
        return super.getExperience();
    }

    @Override
    public void setExperience(byte experience) {
        super.setExperience(experience);
    }
}
