package ru.job4j.stream;

import java.util.stream.Stream;

public class Deck {

    public static void main(String[] args) {
        Stream.of(Value.values())
                .flatMap(v -> Stream.of(Suit.values())
                .map(s -> v + " " + s)).forEach(System.out::println);
    }
}
