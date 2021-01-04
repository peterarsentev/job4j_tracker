package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String anesthesia;
    private String operatingRoom;
    private String kindSurgery;

    public Surgeon() {
    }

    public String name() {
        return super.getName();
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
