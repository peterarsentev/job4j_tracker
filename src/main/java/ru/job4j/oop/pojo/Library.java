package ru.job4j.oop.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = {
                new Book("Clean code"),
                new Book("Java 8"),
                new Book("Core Java Volume I – Fundamentals"),
                new Book("Effective Java")
        };
        printBooks(books);

        System.out.println("Replace 0 to 3.");
        swapElements(books, 0, 3);
        printBooks(books);

        System.out.println("Shown only book with name: Clean code");
        for (Book book: books) {
            if (book.getName().equalsIgnoreCase("Clean code")) {
                System.out.println(book.getName());
            }
        }
    }

    private static void printBooks(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(index + " - " + book.getName());
        }
    }

    private static void swapElements(Book[] books, int indexFrom, int indexTo) {
        Book tmp = books[indexFrom];
        books[indexFrom] = books[indexTo];
        books[indexTo] = tmp;
    }

}
