package Television;

public interface LCD {
  public static LCD buy(Television tv){
    return tv.buyLCD();
  }

  double getSize();
}
