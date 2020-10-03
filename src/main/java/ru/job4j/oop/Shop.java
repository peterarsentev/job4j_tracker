package ru.job4j.oop;

public class Shop {
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++){
            if (products[i] == null){
                System.out.println("Number " + i + "is empty");
                break;
            }
        }
    }
}
