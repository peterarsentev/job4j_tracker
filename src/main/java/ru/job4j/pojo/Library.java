package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Head first Java", 390);
        Book second = new Book("Java SE8", 589);
        Book third = new Book("Clean code", 573);
        Book fourth = new Book("Thinking in Java", 638);

        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getNumOfPages());
        }

        System.out.println();

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getNumOfPages());
        }

        System.out.println();

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getNumOfPages());
            }
        }
    }
}
