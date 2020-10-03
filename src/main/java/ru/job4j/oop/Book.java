package ru.job4j.oop;

public class Book {
    private String name;
    private int nPages;

    public Book(String name, int nPages) {
        this.name = name;
        this.nPages = nPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        this.nPages = nPages;
    }


}
