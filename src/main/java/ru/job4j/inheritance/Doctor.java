package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String nurse;
    private String drugs;
    private String uniform;
    private String tooling;

    public Doctor() {
    }

    public Doctor(String name, String surname, int birthday, int salary) {
        super(name, surname, birthday, salary);
    }

    public Doctor(String education, byte specialization, byte experience) {
        super(education, specialization, experience);
    }

    public Doctor(String nurse, String drugs, String uniform, String tooling) {
        this.nurse = nurse;
        this.drugs = drugs;
        this.uniform = uniform;
        this.tooling = tooling;
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
