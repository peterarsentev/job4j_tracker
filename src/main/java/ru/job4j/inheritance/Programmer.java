package ru.job4j.inheritance;

public class Programmer extends Engineer {
    enum Level {
        JUNIOR,
        MIDDLE,
        SENIOR
    }

    private int salary;

    public Programmer(String name, String surname, String education,
                      String birthday, String workArea, int salary) {
        super(name, surname, education, birthday, workArea);
        this.salary = salary;
    }

    public int calculateSalary(Level level) {
        return salary;
    }
}
