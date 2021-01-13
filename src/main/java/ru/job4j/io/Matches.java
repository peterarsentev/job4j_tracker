package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exitMenu = true;
        while (exitMenu) {
            boolean exitGame = true;
            System.out.println("\nВыберите пункт меню + <Enter> чтобы начать: ");
            System.out.println("1. Против другого игрока");
            System.out.println("2. Против компьютера");
            System.out.println("3. Правила");
            System.out.println("4. Выйти");
            System.out.print("Ваш выбор: ");
            int answer = Integer.parseInt(input.nextLine());
            int count = 1;
            int gamer = 1;
            int total = 11;
            if (answer == 1) {
                System.out.println("\nНачинаем игру - \"Против другого игрока\"");
                while (exitGame) {
                    if (gamer == 1 && total > 0 && count < 4 && count > 0) {
                        System.out.println("Ходит игрок 1");
                        System.out.print("Ваш выбор: ");
                        gamer = 2;
                        count = Integer.parseInt(input.nextLine());
                        total -= count;
                        total = Math.max(total, 0);
                        System.out.println("Осталось спичек " + total);
                    } else if (gamer == 2 && total > 0 && count < 4 && count > 0) {
                        System.out.println("Ходит игрок 2");
                        System.out.print("Ваш выбор: ");
                        gamer = 1;
                        count = Integer.parseInt(input.nextLine());
                        total -= count;
                        total = Math.max(total, 0);
                        System.out.println("Осталось спичек " + total);
                    } else if (total == 0 && count < 4 && count > 0) {
                        System.out.println("\n### Победил игрок "
                                + (gamer == 1 ? 2 : 1) + " ###");
                        exitGame = false;
                    } else {
                        System.out.println("\nНарушение правил, игрок "
                                + (gamer == 1 ? 2 : 1) + " удален из игры!");
                        exitGame = false;
                    }
                }
            } else if (answer == 2) {
                System.out.println("\nНЕ ГОТОВО");
            } else if (answer == 3) {
                System.out.println("\nПравила: На столе лежат 11 спичек. "
                        + "\nДва игрока по очереди берут от 1 до 3 спичек. "
                        + "\nВыигрывает тот, кто забрал последние спички.");
            } else if (answer == 4) {
                System.out.println("Выход");
                exitMenu = false;
            } else {
                System.out.println("\nВведите от 1 до 4");
            }
        }
    }
}