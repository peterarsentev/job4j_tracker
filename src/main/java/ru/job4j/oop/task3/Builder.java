package ru.job4j.oop.task3;

public class Builder extends Engineer {
    private int countBuilding;

    public int getCountBuilding() {
        return countBuilding;
    }

    public void setCountBuilding(int countBuilding) {
        this.countBuilding = countBuilding;
    }

    public int built(int building){
        return countBuilding;
    }

}
