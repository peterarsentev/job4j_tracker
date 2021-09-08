package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int result = -1;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                result = index;
                break;
            }
        }
        return result;
    }
}
