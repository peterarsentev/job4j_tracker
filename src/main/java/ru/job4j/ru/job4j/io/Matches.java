package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("Игрa 11");
        int count = 1;
        while (matches > 3) {
            System.out.println("Игрок "+ (count % 2 == 0 ? 2 : 1) + " возьмите от 1 до 3 спичек");
            int matchersPlayer = input.nextInt();
            matches = matches - matchersPlayer;
            System.out.println("На столе осталось " + matches + " спичек");
            if (matches < 4) {
                System.out.println("Победил игрок " + (count % 2 != 0 ? 2 : 1));
            }
            count++;
        }
    }
}
