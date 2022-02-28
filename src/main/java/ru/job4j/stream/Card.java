package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit='" + suit + '\''
                + ", value='" + value + '\''
                + '}';
    }

    public static void main(String[] args) {
       /* Stream.of(Suit.values()).
                flatMap(suit -> Stream.of(Value.values()).
                        map(value -> suit + " " + value))
                .forEach(System.out::println);*/

        List<Card> cards = Stream.of(Suit.values()).
                flatMap(suit -> Stream.of(Value.values()).
                        map(value -> new Card(suit, value)))
                .collect(Collectors.toList());

        for (Card card: cards) {
            System.out.println(card);
        }
    }
}
