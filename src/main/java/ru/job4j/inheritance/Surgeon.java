package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String anesthesia;
    private String operatingRoom;
    private String kindSurgery;

    public Surgeon(String nurse, String drugs, String uniform, String tooling) {
        super(nurse, drugs, uniform, tooling);
    }

    public Surgeon(String nurse, String drugs, String uniform, String tooling, String anesthesia, String operatingRoom, String kindSurgery) {
        super(nurse, drugs, uniform, tooling);
        this.anesthesia = anesthesia;
        this.operatingRoom = operatingRoom;
        this.kindSurgery = kindSurgery;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getAnesthesia() {
        return anesthesia;
    }

    public void setAnesthesia(String anesthesia) {
        this.anesthesia = anesthesia;
    }

    public String getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(String operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    public String getKindSurgery() {
        return kindSurgery;
    }

    public void setKindSurgery(String kindSurgery) {
        this.kindSurgery = kindSurgery;
    }
}
