package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        while (index < products.length) {
            products[index] = index != 0 ? null : products[index + 1];
            index++;
        }
        return products;
    }
}