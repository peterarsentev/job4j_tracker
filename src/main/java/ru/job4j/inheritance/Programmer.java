package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programmingLanguage;
    private String computerLaptop;
    private String internet;

    public Programmer() {
    }

    public Programmer(String project, String customer, String technicalAssignment, String contractorToOutsource) {
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

    public Programmer(String programmingLanguage, String computerLaptop, String internet) {
        this.programmingLanguage = programmingLanguage;
        this.computerLaptop = computerLaptop;
        this.internet = internet;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getComputerLaptop() {
        return computerLaptop;
    }

    public void setComputerLaptop(String computerLaptop) {
        this.computerLaptop = computerLaptop;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
