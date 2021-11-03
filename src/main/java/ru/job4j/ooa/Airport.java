package ru.job4j.ooa;

/**
 * - класс Airbus нельзя было наследовать;
 *
 * - метод printCountEngine() должен выводить реальное количество двигателей, которое присуще той или иной модели
 * самолета. Поэтому если модель самолета A380 - количество двигателей должно равняться 4,
 *  для всех остальных моделей - используем в качестве значения константу COUNT_ENGINE.
 */
public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        Airbus airbus2 = new Airbus("A380");
        System.out.println(airbus2);

        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printCountEngine();
    }
}
