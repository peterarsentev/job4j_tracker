package ru.job4j.oop;

public class Student {

    public void music(String lyrics){
        System.out.println("I can sign a song : " + lyrics);
    }

    public void song(){
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        for (int i = 0; i < 3; i++) {
            petya.music(song);
        }
        for (int i = 0; i < 3; i++) {
            petya.song();
        }
    }
}
