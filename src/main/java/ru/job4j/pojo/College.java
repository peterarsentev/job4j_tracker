package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.setFIO("Shabelnik ilya Konstantinovich");
        stud.setGroups("P-C10");
        stud.setEntrance("01.09.2010");

        System.out.println("ФИО - " + stud.getFIO() + System.lineSeparator() + "Группа - " + stud.getGroups() +
                System.lineSeparator() + "Дата поступления - " + stud.getEntrance());
    }
}