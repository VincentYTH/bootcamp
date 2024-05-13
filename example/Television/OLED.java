package Television;

public interface OLED {
  public static OLED buy(Television tv){
    return tv.buyOLED();
  }

  double getSize();

}
