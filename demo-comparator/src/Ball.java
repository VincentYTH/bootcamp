import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball>{
  
  private Color color;
  private double size;

  public Ball(Color color, double size){
    this.color = color;
    this.size = size;
  }

  public double getSize(){
    return this.size;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public int compareTo(Ball b){
    if (this.color == Color.YELLOW)
      return -1;
    if (this.color.name().charAt(0) > b.getColor().name().charAt(0))
      return -1;
    else if (this.color.name().charAt(0) < b.getColor().name().charAt(0))
      return 1;
    return this.size > b.getSize() ? -1 : 1;
    // return Color.YELLOW == this.color ? -1 : 1;
    // -1 means (this) object move to left
  }

  @Override
  public String toString(){
    return "Ball(size = " +
    this.size + ", color = " +
    this.color + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.RED, 4.5d));
    balls.add(new Ball(Color.BLACK, 2.0d));
    balls.add(new Ball(Color.YELLOW, 3.2d));
    Collections.sort(balls); // Compile-time Check if the list of the objects implements a contract "Comparable"
    System.out.println(balls);


  }
}
