package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = 0;
            boolean rsl = true;
            while (rsl) {
                matches = Integer.parseInt(input.nextLine());
                if (matches > 3 || matches < 1) {
                    System.out.println("Вы ввели число не от 1 до 3");
                } else if ((count - matches) < 0) {
                    System.out.println("На столе осталось " + count + " спичек, введите число поменьше!");
                } else {
                    rsl = false;
                }
            }
            turn = !turn;
            count -= matches;
            System.out.println("На столе осталось " + count + " спичек!");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
