import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0) ? -1 : 1;
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.RED, 4.5d));
    balls.add(new Ball(Color.BLACK, 3.2d));
    balls.add(new Ball(Color.BLACK, 4.8d));
    balls.add(new Ball(Color.YELLOW, 2.0d));
    balls.add(new Ball(Color.YELLOW, 3.2d));


    int random = new Random().nextInt(2); // 0 or 1
    // Comparator<Ball> formula = null;
    // if (random == 0) {
    //   formula = new SortByColor();
    //   System.out.println("This is sort by Color:");
    // } else if (random == 1) {
    //   formula = new SortBySize();
    // }
    Collections.sort(balls, getFormula(random)); // Open-Close Principle
    System.out.println(balls);
  }

  public static Comparator<Ball> getFormula(int num) {
    if (num == 0) {
      return new SortByColor();
    } else if (num == 1) {
      return new SortBySize();
    }
    return null;
  }

}
