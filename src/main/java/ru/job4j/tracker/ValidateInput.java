package ru.job4j.tracker;

public class ValidateInput implements Input {

    private final Output output;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.output = out;
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
            } catch (NumberFormatException nfe) {
                output.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
