package ru.job4j.stream;

public class Vessel {
    private String name;
    private String registry;
    private int numberIMO;
    private int length;
    private int weight;
    private int displacement;

    public static void main(String[] args) {
        Vessel vessel = new Builder().buildName("Shustriy")
                .buildRegistry("Panama")
                .buildNumberIMO(6542121)
                .buildLength(110)
                .buildWeight(30)
                .buildDisplacement(542432)
                .build();
        System.out.println(vessel);
    }

    static class Builder {
        private String name;
        private String registry;
        private int numberIMO;
        private int length;
        private int weight;
        private int displacement;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildRegistry(String registry) {
            this.registry = registry;
            return this;
        }

        Builder buildNumberIMO(int numberIMO) {
            this.numberIMO = numberIMO;
            return this;
        }

        Builder buildLength(int length) {
            this.length = length;
            return this;
        }

        Builder buildWeight(int weight) {
            this.weight = weight;
            return this;
        }

        Builder buildDisplacement(int displacement) {
            this.displacement = displacement;
            return this;
        }

        Vessel build() {
            Vessel vessel = new Vessel();
            vessel.name = name;
            vessel.registry = registry;
            vessel.numberIMO = numberIMO;
            vessel.length = length;
            vessel.weight = weight;
            vessel.displacement = displacement;
            return vessel;
        }
    }
}
