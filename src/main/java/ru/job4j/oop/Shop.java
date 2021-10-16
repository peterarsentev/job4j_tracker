package ru.job4j.oop;

public class Shop {
    public static void main(String[] args) {
        Product product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Product of(String name, int price) {
        if ("Oil".equals(name)) {
            return new LiquidationProduct(name, price).getProduct();
        }
        return new Product(name, price);
    }
}
