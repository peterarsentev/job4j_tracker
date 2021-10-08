package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index + 1; i < products.length; i++) {
            products[index] = products[i];
            index++;
        }
        products[products.length -1] = null;
        return products;
    }
}
