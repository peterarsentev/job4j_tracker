package ru.job4j.inheritance;

public class Developer extends Programmer {
    private String interfaceFrontOrBack;

    public Developer() {
        super();
    }

    public Developer(String interfaceFrontOrBack) {
        this.interfaceFrontOrBack = interfaceFrontOrBack;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getInterfaceFrontOrBack() {
        return interfaceFrontOrBack;
    }

    public void setInterfaceFrontOrBack(String interfaceFrontOrBack) {
        this.interfaceFrontOrBack = interfaceFrontOrBack;
    }
}
