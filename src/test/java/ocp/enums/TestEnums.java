package ocp.enums;

import org.junit.Test;

public class TestEnums {

    @Test
    public void test() {
      Suit suit = Suit.CLUBS;
      Suit mySuit = Suit.DIAMONDS;
      System.out.println(suit);
      System.out.println(suit == mySuit);
      for (Suit next : Suit.values()) {
          System.out.println(next.name());
          System.out.println(next.ordinal());
          System.out.println(next.getSuitColor());
      }
    }
}


enum Suit {
    CLUBS("Black"), DIAMONDS("Red"), HEARTS("Red"), SPADES("Black");
    private String suitColor;
    private Suit(String suitColor) {
        this.suitColor = suitColor;
    }
    public String getSuitColor() {
        return suitColor;
    }
}
