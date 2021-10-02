package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String eng = "Unknown word";
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic translation  = new DummyDic();
        String word = translation.engToRus();
        System.out.println(word);

    }
}
