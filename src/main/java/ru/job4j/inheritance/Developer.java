package ru.job4j.inheritance;

public class Developer extends Programmer {
    private String interfaceFrontOrBack;

    public Developer() {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Developer(String interfaceFrontOrBack) {
        this.interfaceFrontOrBack = interfaceFrontOrBack;
    }

    public String getInterfaceFrontOrBack() {
        return interfaceFrontOrBack;
    }

    public void setInterfaceFrontOrBack(String interfaceFrontOrBack) {
        this.interfaceFrontOrBack = interfaceFrontOrBack;
    }
}
