package ru.job4j.tracker;

public class StubInput implements Input {
    private  String[] answer;
    private int position = 0;

    public StubInput (String[] answer) {
        this.answer = answer;
    }
    @Override
    public String askSTR(String question) {
        return answer[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askSTR(question));
    }
}
