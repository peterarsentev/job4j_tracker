package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askSTR(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askSTR(question));
    }
}