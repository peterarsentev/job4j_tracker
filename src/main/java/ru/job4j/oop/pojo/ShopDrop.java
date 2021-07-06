package ru.job4j.oop.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index < 0 || index >= products.length) {
            System.out.println("index out of range !!!");
            return products;
        }
        deleteProductInIndex(products, index);
        shiftElementsFromIndex(products, index);
        return products;
    }

    private static void shiftElementsFromIndex(Product[] products, int index) {
        for (; index < products.length - 1; index++) {
            products[index] = products[index + 1];
        }
        products[products.length - 1] = null;
    }

    private static void deleteProductInIndex(Product[] products, int index) {
        products[index] = null;
    }
}
