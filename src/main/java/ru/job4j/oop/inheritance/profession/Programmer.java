package ru.job4j.oop.inheritance.profession;

public class Programmer extends Engineer{
    private int prog;

    public Programmer(String name, String surname, String education, String birthday, boolean allowance, int prog) {
        super(name,surname,education,birthday,allowance);
        this.prog = prog;
    }
}
