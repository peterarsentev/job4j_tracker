package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[3];

        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        for (Product pr : prods) {
            System.out.println(pr.getName() + " - " + pr.getCount());
        }

        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;

        for (Product pr : prods) {
            System.out.println(pr.getName() + " - " + pr.getCount());
        }

        System.out.println("Shown only product.count > 10");
        for (Product pr : prods) {
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
