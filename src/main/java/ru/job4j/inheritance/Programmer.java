package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programmingLanguage;
    private String computerLaptop;
    private String internet;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, int birthday, int salary, byte specialization, byte experience, String project, String customer, String technicalAssignment, String contractorToOutsource, String programmingLanguage, String computerLaptop, String internet) {
        super(name, surname, education, birthday, salary, specialization, experience, project, customer, technicalAssignment, contractorToOutsource);
        this.programmingLanguage = programmingLanguage;
        this.computerLaptop = computerLaptop;
        this.internet = internet;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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
