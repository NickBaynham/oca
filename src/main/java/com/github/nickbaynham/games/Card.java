package com.github.nickbaynham.games;

import java.util.List;
import java.util.function.Predicate;

public class Card {
    private String suit;
    private String rank;

    private static final String[] suites = {"clubs","diamonds","hearts","spades"};
    private static final String[] ranks = {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Card() {
        suit = suites[(int) (Math.random() * suites.length)];
        rank = ranks[(int) (Math.random() * ranks.length)];
    }
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    static public boolean test(List<Card> hand, Predicate<Card> test) {
        for (Card card: hand) {
            if (test.test(card)) return true;
        }
        return false;
    }

    public static void showHand(List<Card> hand) {
        for (Card card : hand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }
}
