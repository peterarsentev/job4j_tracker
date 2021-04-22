package other;

public class Engineer extends Profession {

    private String jobSpecial;

    public Engineer(String surName, String name, String education, int birthday, String jobSpecial) {
        super(surName, name, education, birthday);
        this.jobSpecial = jobSpecial;
    }
}
