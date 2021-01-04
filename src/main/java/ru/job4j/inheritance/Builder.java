package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String buildingImplements;
    private String helmet;

    public Builder() {
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
