package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String workArea;

    public Engineer(String name, String surname, String education,
                    String birthday, String workArea) {
        super(name, surname, education, birthday);
        this.workArea = workArea;
    }

    public void work() {
    }
}
