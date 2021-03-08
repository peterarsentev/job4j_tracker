package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Пожалуйста введите число");
            }
        } while (invalid);

        return value;
    }
}
