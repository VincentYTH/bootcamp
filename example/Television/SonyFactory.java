package Television;

public class SonyFactory implements Television {
  @Override
  public OLED buyOLED(){
    System.out.println("I have my own way to buy Sony OLED TV");
    return new Sony(28.0d);
  }

  @Override
  public LCD buyLCD(){
    System.out.println("I have my own way to buy Sony LCD TV");
    return new Sony(35.0d);
  }
}
