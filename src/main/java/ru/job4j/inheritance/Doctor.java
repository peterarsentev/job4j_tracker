package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String nurse;
    private String drugs;
    private String uniform;
    private String tooling;

    public Doctor() {
    }

    public Doctor(String category, int experience) {
    }

    public String name() {
        return super.getName();
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
