package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String citizen;
    private String teeth;
    private String mouthCavity;

    public Dentist() {
    }

    public Dentist(String nurse, String drugs, String uniform, String tooling) {
        super(nurse, drugs, uniform, tooling);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Dentist(String citizen, String teeth, String mouthCavity) {
        this.citizen = citizen;
        this.teeth = teeth;
        this.mouthCavity = mouthCavity;
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
