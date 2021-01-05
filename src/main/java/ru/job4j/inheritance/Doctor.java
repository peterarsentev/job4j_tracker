package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String nurse;
    private String drugs;
    private String uniform;
    private String tooling;

    public Doctor() {
    }

    public String getName(String name) {
        return super.getName();
    }

    public String setName(String name) {
        return super.setName();
    }

    public String getSurname(String surname) {
        return super.getSurname();
    }

    public String setSurname(String surname) {
        return super.setSurname();
    }

    public String getEducation(String education) {
        return super.getEducation();
    }

    public String setEducation(String education) {
        return super.setEducation();
    }

    public Diagnosis heal(Patient patient) {
        return null;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public String getTooling() {
        return tooling;
    }

    public void setTooling(String tooling) {
        this.tooling = tooling;
    }
}
