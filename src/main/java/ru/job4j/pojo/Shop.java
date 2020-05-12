package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product product : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            }
        }
        delete(products, 2);

    }

    public static void delete(Product[] products, int index) {
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом = " + index);
        //удаляем значение из ячейки с индексом 1
        products[index] = null;

        for (int i = index; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку значение следующей ячейки.
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            //удаляем значение из следующей ячейки
            products[i + 1] = null;
        }
        products[products.length - 1] = null;

        for (Product product : products) {
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}

