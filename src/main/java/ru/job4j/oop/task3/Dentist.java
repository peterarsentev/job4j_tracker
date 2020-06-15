package ru.job4j.oop.task3;

public class Dentist extends Doctor {

    private boolean healthyTooth;

    public boolean isHealthyTooth() {
        return healthyTooth;
    }

    public void setHealthyTooth(boolean healthyTooth) {
        this.healthyTooth = healthyTooth;
    }

    public boolean treatmentTooth() {
        return true;
    }
}
