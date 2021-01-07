package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String citizen;
    private String teeth;
    private String mouthCavity;

    public Dentist(String nurse, String drugs, String uniform, String tooling) {
        super(nurse, drugs, uniform, tooling);
    }

    public Dentist(String nurse, String drugs, String uniform, String tooling, String citizen, String teeth, String mouthCavity) {
        super(nurse, drugs, uniform, tooling);
        this.citizen = citizen;
        this.teeth = teeth;
        this.mouthCavity = mouthCavity;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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
