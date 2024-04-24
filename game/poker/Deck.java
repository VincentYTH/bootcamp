package game.poker;

import java.util.Arrays;

public class Deck {

  public static final Suit[] SUITS = new Suit[]{Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
  public static final Rank[] RANKS = new Rank[]{Rank.ONE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};
  
  private final Card[] cards;// final the address of array -> firm 0 or 52(constructor)

  private Deck(boolean isEmpty){
    if (isEmpty) {
      this.cards = new Card[0];
    }else{
      this.cards = new Card[52];
    int idx = 0;
    for (Suit suit : SUITS){// Suit
      for (Rank rank : RANKS){// Rank
        this.cards[idx++] = new Card(rank, suit);
        }
      }
    }
  }

  public Card[] getCards(){
    return this.cards;
  }

  public static Deck empty() {
    return new Deck(true);
  }

  public static Deck full(){
    return new Deck(false);
  }

  @Override
  public String toString(){
    return "Deck("//
    + "cards=" + Arrays.toString(cards);
  }

  public static void main(String[] args) {
    // Deck deck = new Deck();
    Deck deck2 = Deck.empty();
    Deck deck3 = Deck.full();
    System.out.println(deck2);
    System.out.println(deck3);
    
    Suit x = Suit.SPADE;
    System.out.println(x != Suit.CLUB);// true
  }
  
}
