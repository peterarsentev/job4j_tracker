package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        Product temp = null;
        Product first = null;
        for (int i = products.length - 1; i >= index ; i--) {
            temp = first;
            first = products[i];
            products[i] = temp;
        }
        return products;
    }
}