package ru.job4j.pojo;

import com.sun.source.tree.IfTree;

public class Library {
    public static void main(String[] args) {
        Book red = new Book("Red", 98);
        Book blue = new Book("Blue", 150);
        Book green = new Book("Green", 44);
        Book cleanCode = new Book("Clean code", 100);

        Book[]  books = new Book[4];

        books[0] = red;
        books[1] = cleanCode;
        books[2] = green;
        books[3] = blue;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println("Переставим местами книги с индексом 0 и 3.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Цикл с выводом книг с именем \"Clean code\"");
        for (Book book : books) {
            if ("Clean code".equals(book.getName()))
            System.out.println(book.getName());
        }
    }
}
