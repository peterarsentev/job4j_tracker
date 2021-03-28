package ru.job4j.stream;

import java.util.stream.Stream;

public class CardDest {
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> suit + " " + value))
                .forEach(System.out::println);
    }
}
