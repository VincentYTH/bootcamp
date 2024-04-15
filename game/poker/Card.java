package game.poker;

public class Card {
  
  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit){
    this.rank = rank;
    this.suit = suit;
  }

  public void setRank(Rank rank){
    this.rank = rank;
  }

  public void setSuit(Suit suit){
    this.suit = suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public String toString(){
    return "Card("//
    + "suit=" + this.suit//
    + "rank=" + this.rank//
    + ")";
  }
}
