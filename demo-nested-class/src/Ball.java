public class Ball {
  private Color color;
  private double weight;

  public enum Color{
    RED, YELLOW, BLACK;
  }

  // public Ball(Color color, double weight){
  //   this.color = color;
  //   this.weight = weight;
  // }

  public Ball(){}

  public Ball(BallBuilder ballBuilder){
    this.color = ballBuilder.color;
    this.weight = ballBuilder.weight;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public String toString(){
    return "Ball(Color = "
    +this.color + ", Weight = "
    +this.weight + ")";
  }

  public static BallBuilder builder(){
    return new BallBuilder();
  }

  // Builder Pattern (Coding Pattern)
  // 1. avoid setter, so that I can create ball object with all attributes values
  // 2. avoid all-args constructor()
  public static class BallBuilder{
    private Color color;
    private double weight;

    public BallBuilder setColor(Color color){ // chain method
      this.color = color;
      return this;
    }

    public BallBuilder setWeight(double weight){ // chain method
      this.weight = weight;
      return this;
    }

    public Ball build(){
      return new Ball(this);
    }
  }

  public static void main(String[] args) {
    // Builder Pattern is an alternative for creating objects.
    Ball ball = new Ball.BallBuilder()
    .setColor(Color.RED)
    .setWeight(30.0d)
    .build();
    System.out.println(ball);

    Ball ball2 = Ball.builder()
    .setColor(Color.YELLOW)
    .setWeight(40.0d)
    .build();
    System.out.println(ball2);

    ball2.setColor(Color.RED);
    ball2.setWeight(50.d);
    System.out.println(ball2);

    Ball ball3 = new Ball();
    ball3.setColor(Color.BLACK);
    ball3.setWeight(25d);
    System.out.println(ball3);
  }
}
