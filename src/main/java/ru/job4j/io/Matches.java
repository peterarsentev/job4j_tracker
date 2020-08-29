package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя игрока 1");
        String gamer1 = input.nextLine();
        System.out.println("Введите имя игрока 2");
        String gamer2 = input.nextLine();
        int fires = 21;
        while (true) {
            int carry1;
            int carry2;
            System.out.println("Ход игрока: " + gamer1);
            if (fires > 0){
                System.out.println("Игрок " + gamer1 + " берет спички: ");
                do {
                    carry1 = input.nextInt();
                } while ((carry1 <= 0) || (carry1 > 3));
                fires -= carry1;
                System.out.println("Осталось спичек: " + fires);
            }
            else {
                System.out.println("Выиграл игрок " + gamer2);
                break;
            }

            if (fires > 0){
                System.out.println("Игрок " + gamer2 + " берет спички: ");
                do {
                    carry2 = input.nextInt();
                } while ((carry2 <= 0) || (carry2 > 3));
                fires -= carry2;
                System.out.println("Осталось спичек: " + fires);
            }
            else {
                System.out.println("Выиграл игрок " + gamer1);
                break;
            }


        }

    }
}
