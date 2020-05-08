package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String text = "Песня не найдена";
        if (position == 1) {
            text = "Пусть бегут неуклюже";
        }
        if (position == 2) {
            text = "Спокойной ночи";
        }
        System.out.println(text);
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(-0);
    }
}
