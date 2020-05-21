package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("Игрa 11");
        boolean first = true;
        int matchersPlayer;
        while (matches > 0) {
            String player = first ? "первый" : "второй";
            System.out.println("Игрок "+ player + " возьмите от 1 до 3 спичек");
            matchersPlayer = input.nextInt();
            if (matchersPlayer > 0 && matchersPlayer < 4){
                matches = matches - matchersPlayer;
                System.out.println("На столе осталось " + matches + " спичек");
                if (matches < 1) {
                    System.out.println("Победил игрок " + player);
                }
                first = !first;
            } else {
                System.out.println("Вы ввели неверное число.");
            }
        }
    }
}
