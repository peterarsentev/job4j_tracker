package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book pirates = new Book("Pirates of the Caribbean", 600);
        Book magic = new Book("Spell for levitation", 800);
        Book space = new Book("Live on the Mars", 300);
        Book starGate = new Book("Atlantis", 900);
        Book[] catalogue = new Book[4];
        catalogue[0] = pirates;
        catalogue[1] = magic;
        catalogue[2] = space;
        catalogue[3] = starGate;
        Book cCode = new Book("Clean Code", 400);
        for (int i = 0; i < catalogue.length; i++) {
            Book bk = catalogue[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        catalogue[0] = cCode;
        Book temp;
        temp = catalogue[0];
        catalogue[0] = catalogue[3];
        catalogue[3] = temp;
        for (int i = 0; i < catalogue.length; i++) {
            Book bk = catalogue[i];
            if (bk.getName().equals("Clean Code")) {
                System.out.println("\n" + bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
