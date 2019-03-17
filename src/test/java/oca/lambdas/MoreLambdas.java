package oca.lambdas;

import org.junit.Test;
import com.github.nickbaynham.games.Card;

import java.util.ArrayList;
import java.util.List;

public class MoreLambdas {

    @Test
    public void test() {
        List<Card> myHand = new ArrayList<>();
        myHand.add(new Card());
        myHand.add(new Card());
        myHand.add(new Card());

        if (Card.test(myHand, a->a.getRank().equals("A")))
            System.out.println("I have an Ace");

        if (Card.test(myHand, a->a.getSuit().equals("clubs")))
            System.out.println("At least one of the cards is Clubs");

        Card.showHand(myHand);
    }
}
