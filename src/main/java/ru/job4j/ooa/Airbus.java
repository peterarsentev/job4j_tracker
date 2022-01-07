package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static int countEngine;
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
        this.howCountEngine();
    }

    private void howCountEngine() {
        if (name.equals("A380")) {
            countEngine = 4;
        } else {
            countEngine = COUNT_ENGINE;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.howCountEngine();
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + ", "
                + "Количество двигателей равно = " + countEngine + '\''
                + '}';
    }
}
