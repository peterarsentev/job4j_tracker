package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String project;
    private String customer;
    private String technicalAssignment;
    private String contractorToOutsource;

    public Engineer() {
    }

    public String name() {
        return super.getName();
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
}
