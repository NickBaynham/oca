package oca.arrays;

import org.junit.Test;

import java.util.function.Predicate;

public class Arrays {

    @Test
    public void test() {
        int[] array;
        int[] multi[];

        array = new int[5];
        System.out.println(array.length);
        array[0] = 42;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int i : array) {
            System.out.println(i);
        }

        int[] cloned = array.clone();
        for (int i : cloned) {
            System.out.println(i);
        }
    }

    @Test
    public void test_2() {
        String[] suits = {
          "Clubs",
          "Spades",
          "Hearts",
          "Diamonds",
        };

        String[] cards = {
          "Ace",
          "Two",
          "Three",
          "Four",
          "Five",
          "Six",
          "Seven",
          "Eight",
          "Nine",
          "Ten",
          "Jack",
          "Queen",
          "King"
        };

        String[] myHand = {
                cards[(int) (Math.random() * 13)]  + " of " + suits[(int) (Math.random() * 4)],
                cards[(int) (Math.random() * 13)]  + " of " + suits[(int) (Math.random() * 4)],
                cards[(int) (Math.random() * 13)]  + " of " + suits[(int) (Math.random() * 4)],
        };

        System.out.print("My hand is: ");
        for (String card : myHand) {
            System.out.print(card + ", ");
        }

        doStuff(myHand);
        doStuff(new String[] {
            cards[(int) (Math.random() * 13)]  + " of " + suits[(int) (Math.random() * 4)],
            cards[(int) (Math.random() * 13)]  + " of " + suits[(int) (Math.random() * 4)],
            cards[(int) (Math.random() * 13)]  + " of " + suits[(int) (Math.random() * 4)]
            }
        );

        Cards myCards = new Cards();
        if (hasCard(myHand, a->a.contains("Ace")))
            System.out.println("I have an Ace");

        String newCard = myCards.pickACard();
        System.out.println("Card: " + newCard);

    }

    private void doStuff(String[] cards ) {
        if (cards.length > 0) {
            System.out.println(cards[0]);
        }
    }

    private boolean hasCard(String[] hand, Predicate<String> test) {
        for (String card : hand) {
            if (test.test(card)) return true;
        }
        return false;
    }

}

class Cards {

    String pickACard() {
        return getRandomCard() + " of " + getRandomSuit();
    }
    private String getRandomSuit() {
        return suit[random(4)];
    }

    private String getRandomCard() {
        return card[random(13)];
    }

    private int random(int range) {
        return (int) (Math.random() * range);
    }
    private final String[] suit = {
            "Clubs",
            "Spades",
            "Hearts",
            "Diamonds",
    };

    private final String[] card = {
            "Ace",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Jack",
            "Queen",
            "King"
    };

    final int[] value = {
            1,2,3,4,5,6,7,8,9,10,10,10,10
    };
}