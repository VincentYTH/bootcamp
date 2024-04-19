package dice;

enum FCP {
  FISH (1),
  CRAB (2),
  PRAWN (3);

  private int value;

  private FCP(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }
}
