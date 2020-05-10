package ru.job4j.oop.task3;

public class Programmer extends Engineer {

    private int bugs;

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    public boolean fixBug(String language) {
        return true;
    }
}
