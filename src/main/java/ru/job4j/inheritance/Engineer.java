package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String project;
    private String customer;
    private String technicalAssignment;
    private String contractorToOutsource;

    public Engineer() {
    }

    public Engineer(String name, String surname, int birthday, int salary) {
        super(name, surname, birthday, salary);
    }

    public Engineer(String education, byte specialization, byte experience) {
        super(education, specialization, experience);
    }

    public Engineer(String project, String customer, String technicalAssignment, String contractorToOutsource) {
        this.project = project;
        this.customer = customer;
        this.technicalAssignment = technicalAssignment;
        this.contractorToOutsource = contractorToOutsource;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTechnicalAssignment() {
        return technicalAssignment;
    }

    public void setTechnicalAssignment(String technicalAssignment) {
        this.technicalAssignment = technicalAssignment;
    }

    public String getContractorToOutsource() {
        return contractorToOutsource;
    }

    public void setContractorToOutsource(String contractorToOutsource) {
        this.contractorToOutsource = contractorToOutsource;
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
