package ru.job4j.inheritance;

public class Patient {
    private String sex;
    private String origin; /*people or animals*/
    private byte age;
    private byte health;

    public Patient() {
    }

    public Patient(String sex, String origin, byte age, byte health) {
        this.sex = sex;
        this.origin = origin;
        this.age = age;
        this.health = health;
    }

    public String getSex() {
        return sex;
    }

    public byte getAge() {
        return age;
    }

    public String getOrigin() {
        return origin;
    }

    public byte getHealth() {
        return health;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

}
