package game.poker;

public class Hand {

  private Card[] cards;

  public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
    if (c1 == null || c2 == null || c3 == null || c4 == null || c5 == null) {
      throw new IllegalArgumentException();
    }
    this.cards = new Card[5];
    this.cards[0] = c1;
    this.cards[1] = c2;
    this.cards[2] = c3;
    this.cards[3] = c2;
    this.cards[4] = c5;
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static boolean isFourKind(Card[] cards){//check if there are same 4 cards of 5 cards
    if (cards.length != 5) {
      return false;
    }
      int[] arr = new int[13];
      for (int i=0; i<cards.length; i++){
        arr[cards[i].getRank() - 1]++;
      }
      for (int i=0; i<arr.length; i++){
        if (arr[i] == 4) {
          return true;
        }
      }
      return false;
  }

  // Static Method
  public static boolean isFourKind(Hand hand){
    return isFourKind(hand.getCards());
  }

  // -> Instance Method
  public boolean isFourKind(){
    return isFourKind(this.cards);
  }

}
