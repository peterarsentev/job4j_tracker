package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
/*        for (int i = index; i < products.length; i++) {
            if (i != 0) {
                products[i] = null;
            } else {
                products[i] = products[i + 1];
            }
        }*/

/*        if (products.length - 1 - index >= 0) {
            System.arraycopy(products, index + 1,
                    products, index, products.length - 1 - index);
        }
        products[products.length - 1] = null;*/

        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}