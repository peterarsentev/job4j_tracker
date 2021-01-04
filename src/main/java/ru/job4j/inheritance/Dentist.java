package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String citizen;
    private String teeth;
    private String mouthCavity;

    public Dentist() {
    }

    public String name() {
        return super.getName();
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getTeeth() {
        return teeth;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public String getMouthCavity() {
        return mouthCavity;
    }

    public void setMouthCavity(String mouthCavity) {
        this.mouthCavity = mouthCavity;
    }
}
