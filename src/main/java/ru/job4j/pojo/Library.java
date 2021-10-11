package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book clean = new Book("Clean code", 21);
        Book bun = new Book("Bun", 12);
        Book animals = new Book("Animals", 52);
        Book birds = new Book("Birds", 43);

        Book[] books = new Book[4];
        books[0] = clean;
        books[1] = bun;
        books[2] = animals;
        books[3] = birds;

        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("-----Replace 0 and 3");
        Book zap = new Book("stop",0);
        zap = books[0];
        books[0] = books[3];
        books[3] = zap;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("-------Print only \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if (pr.getName().equals("Clean code"))
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
    }
}
