package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic petya = new DummyDic();
        petya.engToRus("джава");
        System.out.println(petya.engToRus("джава"));
    }
}
