package ru.job4j.tracker;


public class StartUI extends Item{


    public static void main(String[] args) {
        Item first = new Item();
        first.setId(555);
        first.setName("Dima ");
        System.out.println(first.getName() + first.getId());
    }
}
