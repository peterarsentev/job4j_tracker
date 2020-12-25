package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox playMusic = new Jukebox();
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
            playMusic.music(i);
        }
    }
}
