package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book chairs = new Book("12 стульев", 379);
        Book pride = new Book("Гордость и предубеждения", 564);
        Book moron = new Book("Идиот", 402);
        Book clean = new Book ("Clean code", 464);
        Book[] lib = new Book[4];
        lib[0] = chairs;
        lib[1] = pride;
        lib[2] = moron;
        lib[3] = clean;
        for (Book pr : lib) {
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        lib[0] = clean;
        lib[3] = chairs;
        for (Book pr : lib) {
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        for (Book pr : lib) {
            if ("Clean code".equals(pr.getName())) {
                System.out.println(pr.getName() + " - " + pr.getPages());
            }
        }
    }
}