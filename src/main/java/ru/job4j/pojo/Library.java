package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("chort", 666);
        Book book2 = new Book("kolobok", 5);
        Book book3 = new Book("koran", 1000);
        Book book4 = new Book("Clean code", 300);
        Book[] shelf = new Book[4];
        shelf[0] = book1;
        shelf[1] = book2;
        shelf[2] = book3;
        shelf[3] = book4;
        for (int i = 0; i < 4; i++) {
            System.out.println(shelf[i].toString());
        }
        Book temp = new Book("", 0);
        temp = shelf[0];
        shelf[0] = shelf[3];
        shelf[3] = temp;
        temp = null;

        for (Book i
                : shelf) {
            System.out.println(i.toString());
        }
        for (Book i
                : shelf) {
            if (i.getSign().equals("Clean code")) {
                System.out.println(i.toString());
            }
        }
    }
}
