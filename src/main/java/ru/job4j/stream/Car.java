package ru.job4j.stream;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private boolean used;
    private int price;
    private char euroClass;

    @Override
    public String toString() {
        return "Builder{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + ", power=" + power
                + ", used=" + used
                + ", price=" + price
                + ", euroClass=" + euroClass
                + '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private String color;
        private int power;
        private boolean used;
        private int price;
        private char euroClass;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildPower(int power) {
            this.power = power;
            return this;
        }

        Builder buildUsed(boolean used) {
            this.used = used;
            return this;
        }

        Builder buildPrice(int price) {
            this.price = price;
            return this;
        }

        Builder buildEuroClass(char euroClass) {
            this.euroClass = euroClass;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.color = color;
            car.power = power;
            car.used = used;
            car.price = price;
            car.euroClass = euroClass;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Mazda")
                .buildModel("Atenza")
                .buildColor("Red")
                .buildPower(180)
                .buildUsed(false)
                .buildPrice(1000000)
                .buildEuroClass('6')
                .build();
        System.out.println(car);
    }
}

