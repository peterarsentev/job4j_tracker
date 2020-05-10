package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean", 1000);
        Book book2 = new Book("Clean code", 10);
        Book book3 = new Book("Code", 345);
        Book book4 = new Book("Pattern", 123);

        Book[] libr = new Book[4];
        libr[0] = book1;
        libr[1] = book2;
        libr[2] = book3;
        libr[3] = book4;

        for (Book lb : libr) {
            System.out.println(lb.getName() + " " + lb.getPages());
        }

        System.out.println("Replace book 0 and 3");
        Book lbNew = libr[0];
        libr[0] = libr[3];
        libr[3] = lbNew;
        for (Book lb : libr) {
            System.out.println(lb.getName() + " " + lb.getPages());
        }
        System.out.println("print book with name 'Clean code'");
        for (Book librar : libr) {
            if (librar.getName().equals("Clean code")) {
                System.out.println(librar.getName() + " " + librar.getPages());

            }
        }

    }
}
