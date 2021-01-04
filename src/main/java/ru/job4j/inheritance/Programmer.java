package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programmingLanguage;
    private String computerLaptop;
    private String internet;

    public Programmer() {
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
