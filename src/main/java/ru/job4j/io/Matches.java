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
            System.out.println(player + " Введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4) {
                turn = !turn;
                count = count - matches;
                System.out.println(count + " - Осталось спичек на столе");
            } else {
                System.out.println("Неправильное количество спичек!");
            }
        }
        if (!turn) {
            System.out.println("Выйграл первый игрок");
        } else {
            System.out.println("Выйграл второй игрок");
        }
    }
}
