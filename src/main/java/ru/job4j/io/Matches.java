package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fires = 21;
        boolean player = false;
        while (fires > 0) {
            player = !player;
            int carry;
            String mainGamer = player ? "player1" : "player2";
            System.out.println("Ход игрока: " + mainGamer);
                System.out.println(mainGamer);
                do {
                    carry = input.nextInt();
                } while ((carry <= 0) || (carry > 3));
                fires -= carry;
                System.out.println("Осталось спичек: " + fires);
            if (fires <= 0) {
                System.out.println("Выиграл игрок " + mainGamer);
            }
        }

    }
}
