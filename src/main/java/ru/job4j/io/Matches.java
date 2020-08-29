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
            int carry;
            String mainGamer = gamer2;
            gamer2 = gamer1;
            gamer1 = mainGamer;

            System.out.println("Ход игрока: " + mainGamer);
                System.out.println("Игрок " + mainGamer + " берет спички: ");
                do {
                    carry = input.nextInt();
                } while ((carry <= 0) || (carry > 3));
                fires -= carry;
                System.out.println("Осталось спичек: " + fires);
            if (fires <= 0) {
                System.out.println("Выиграл игрок " + mainGamer);
                break;
            }
        }

    }
}
