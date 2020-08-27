package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student shkoliar = new Student();
        Date date = new Date(2000, 2, 9);
        shkoliar.setFirstName("Alan");
        shkoliar.setLastName("Turing");
        shkoliar.setData(date);
        shkoliar.setGroup(255);
        System.out.println(String.format(shkoliar.getFirstName() + " " + shkoliar.getLastName() +
                " " + shkoliar.getGroup() + " " + shkoliar.getData()));
    }

}
