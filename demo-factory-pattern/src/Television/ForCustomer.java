package Television;

import Television.Television.Factory;

public class ForCustomer {
  public static void main(String[] args) {
    OLED tv = Television.buy(Factory.SONY).buyOLED();
    System.out.println(tv.getSize());

    LCD tv2 = Television.buy(Factory.SAMSUNG).buyLCD();
    System.out.println(tv2.getSize());
  }
}
