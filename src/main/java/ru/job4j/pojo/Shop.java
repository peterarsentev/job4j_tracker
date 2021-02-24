package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        int i = -1;
        for (int j = 0; j < products.length; j++) {
            if (products[j] == null) {
                i = j;
                break;
            }
        }
        return i;
    }
}