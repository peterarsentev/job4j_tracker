package ru.job4j.oop;

public class StoryFirst {

    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        WolfFirst wolfFirst = new WolfFirst();
        girl.help(petya);
        wolfFirst.eat(girl);
        petya.kill(wolfFirst);
    }
}
