package ru.job4j.inheritance;

public class Builder extends Engineer {
    private Build build;
    private Tool tool;

    public Build building(String task) {
        return build;
    }
}
