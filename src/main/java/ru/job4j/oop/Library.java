package ru.job4j.oop;

public class Library {
    public static void main(String[] args){
        Book b1 = new Book("Name1",100);
        Book b2 = new Book("Name2",200);
        Book b3 = new Book("Clean code",300);
        Book b4 = new Book("Name4",400);
        Book books [] = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        for (int i = 0; i < books.length; i++){
            Book b = books[i];
            System.out.println(b.getName() + System.lineSeparator() + b.getnPages() + System.lineSeparator());
        }

        books[0] = b4;
        books[3] = b1;
        for (int i = 0; i < books.length; i++){
            Book b = books[i];
            System.out.println(b.getName() + System.lineSeparator() + b.getnPages() + System.lineSeparator());
        }
        for (int i = 0; i < books.length; i++){
            if(books[i].getName().equals("clean Code")){
                System.out.println("it is book number "+ i);
            }
        }
    }
}
