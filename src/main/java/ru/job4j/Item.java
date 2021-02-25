package ru.job4j;

public class Item {
    private String name;
    private int id;

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}
