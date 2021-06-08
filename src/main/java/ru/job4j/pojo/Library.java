package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book schildt = new Book("Java: A Beginner's Guide", 624);
        Book headFirst = new Book("Head First Java", 720);
        Book eckel = new Book("Thinking in Java", 1025);
        Book martin = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = schildt;
        books[1] = headFirst;
        books[2] = eckel;
        books[3] = martin;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumbers());
        }
        System.out.println();
        System.out.println("Replace book 1 and book 3");
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumbers());
        }
        System.out.println();
        System.out.println("Clean code only");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getNumbers());
            }
        }
    }
}
