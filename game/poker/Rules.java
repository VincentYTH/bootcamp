package game.poker;

public class Rules {

  // Design: Single Card

  // Instance Method: card.compareTo(another card) -> 1,0,-1

  // Static Method: compareTo(Card c1, Card c2) -> 1,0,-1
  
  public static boolean isFullHouse(Card[] cards){
    // Early return
    if (cards.length != 5) {
      return false;
    }
    // Main logic...
    return false;
  }


  public static void main(String[] args) {
    Deck deck = Deck.full();
  }


}
