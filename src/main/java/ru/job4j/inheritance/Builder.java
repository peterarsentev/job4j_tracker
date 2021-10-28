package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String object;

    public Builder(String name, String surname, String education,
                   String birthday, String workArea, String object) {
        super(name, surname, education, birthday, workArea);
        this.object = object;
    }

    public String chooseObject() {
        return object;
    }
}
