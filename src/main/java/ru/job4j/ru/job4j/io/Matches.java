package ru.job4j.ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        System.out.println("Игрa 11");
        System.out.println("Возмите от 1 до 3 спичек");
        int count = 1;
        while (true) {
            int matchersPlayer = input.nextInt();
            matches = matches - matchersPlayer;
            System.out.println("На столе осталось " + matches + " спичек");
            if (matches < 4) {
                if (count % 2 != 0){
                    System.out.println("Победил игрок " + 2);
                } else {
                    System.out.println("Победил игрок " + 1);
                }
            }
            count++;
        }
    }
}
