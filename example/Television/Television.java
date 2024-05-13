package Television;

public interface Television {

  enum Factory{
    SONY, SAMSUNG;
  }

  OLED buyOLED();
  LCD buyLCD();

  public static Television buy(Factory factory){
    return switch (factory) {
      case SAMSUNG -> new SamsungFactory();
      case SONY -> new SonyFactory();
    };
  }
}
