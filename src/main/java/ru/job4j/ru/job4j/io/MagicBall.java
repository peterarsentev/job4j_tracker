package ru.job4j.ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        String predict = "Может быть";
        if (answer == 0) {
            predict = "Нет";
        }
        System.out.println(predict);
    }
}
