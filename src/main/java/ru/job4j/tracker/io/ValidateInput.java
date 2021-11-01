package ru.job4j.tracker.io;

import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.io.Output;

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output output, Input input) {
        this.out = output;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException numberFormatException) {
                out.println("Пожалуйста введите число");
            }
        } while (invalid);

        return value;
    }
}
