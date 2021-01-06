package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String buildingImplements;
    private String helmet;

    public Builder() {
    }

    public Builder(String project, String customer, String technicalAssignment, String contractorToOutsource) {
        super(project, customer, technicalAssignment, contractorToOutsource);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Builder(String buildingImplements, String helmet) {
        this.buildingImplements = buildingImplements;
        this.helmet = helmet;
    }

    public String getBuildingImplements() {
        return buildingImplements;
    }

    public void setBuildingImplements(String buildingImplements) {
        this.buildingImplements = buildingImplements;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }
}
