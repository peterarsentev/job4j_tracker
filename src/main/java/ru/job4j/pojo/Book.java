package ru.job4j.pojo;

public class Book {
    private String name;
    private int numOfPages;

    public Book(String name, int numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
