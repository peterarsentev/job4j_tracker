package ru.job4j.oop;

public class Item {

    String id, name;

    public Item() {
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item("007");
        Item item3 = new Item("007","agent");
    }
}