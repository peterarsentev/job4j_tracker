package ru.job4j.stream;

import java.util.stream.Stream;

public class Deck {

    public static void main(String[] args) {
        Suit suit = Suit.Clubs;
        Value value = Value.V_6;
        Card card = new Card(suit, value);

        Stream.of(Suit.values())
                .flatMap(s -> Stream.of(Value.values())
                .map(s -> s. ))
    }


}
