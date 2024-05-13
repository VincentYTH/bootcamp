package maths;

public class Addition implements MathOperation {
  // with no lambda
  @Override
  public double operate(double x, double y){
    return x + y;
  }

  public static void main(String[] args) {
    Addition addition = new Addition();
    addition.operate(2, 3);
    }
}
