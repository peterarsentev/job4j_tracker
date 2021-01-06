package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String anesthesia;
    private String operatingRoom;
    private String kindSurgery;

    public Surgeon() {
    }

    public Surgeon(String nurse, String drugs, String uniform, String tooling) {
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

    public Surgeon(String anesthesia, String operatingRoom, String kindSurgery) {
        this.anesthesia = anesthesia;
        this.operatingRoom = operatingRoom;
        this.kindSurgery = kindSurgery;
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
