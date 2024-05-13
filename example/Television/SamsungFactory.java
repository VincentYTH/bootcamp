package Television;

public class SamsungFactory implements Television{
  @Override
  public OLED buyOLED(){
    System.out.println("I have my own way to buy Samsung OLED TV");
    return new Samsung(27.0d);
  }

  @Override
  public LCD buyLCD(){
    System.out.println("I have my own way to buy Samsung LCD TV");
    return new Samsung(33.0d);
  }
}
