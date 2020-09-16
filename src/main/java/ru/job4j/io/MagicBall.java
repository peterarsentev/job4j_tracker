package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        String[] choice = {"да", "нет", "может быть" };
        Scanner input = new Scanner(System.in);
        System.out.println("Что ты хочешь узнать?");
        input.nextLine();
        int random = new Random().nextInt(3);
        System.out.println(choice[random]);
    }
}
