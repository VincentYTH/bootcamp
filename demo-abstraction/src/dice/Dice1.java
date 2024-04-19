package dice;

import java.util.Arrays;
import java.util.Random;

public class Dice1 implements Roll {

  private final Color[] colors = {Color.RED, Color.BLACK, Color.YELLOW, 
    Color.BLACK, Color.BLUE, Color.WHITE};

  public Color[] getColor(){
    return this.colors;
  }

  @Override
  public int roll(){
    int idx = new Random().nextInt(6); // 0~5
    return colors[idx].getValue();
  }

  public Color roll2(){
    int idx = new Random().nextInt(6); // 0~5
    return colors[idx];
  }

  @Override
  public String toString(){
    return "Dise1 ("
    + "colors = "
    + Arrays.toString(colors)
    + ")";
  }

  public static void main(String[] args) {
    Dice1 d = new Dice1();
    d.getColor()[1] = Color.RED;
    System.out.println(d.toString());
  }
}
