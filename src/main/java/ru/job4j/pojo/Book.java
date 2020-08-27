package ru.job4j.pojo;

public class Book {
    private String sign;
    private int pages;

    public Book(String sign, int pages){
        this.pages = pages;
        this.sign = sign;
    }
    @Override
    public String toString() {
        return "Book{" +
                "sign='" + sign + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getSign() {
        return sign;
    }
}
