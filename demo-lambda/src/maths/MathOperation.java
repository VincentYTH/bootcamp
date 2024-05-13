package maths;

@FunctionalInterface
public interface MathOperation {
  double operate(double x, double y);

  static double calculate(int x, int y, MathOperation formula){
    return formula.operate(x, y);
  }

  public static void main(String[] args) {
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtract = (a, b) -> a - b;
    MathOperation multiply = (a, b) -> a * b;
    MathOperation divide = (a, b) -> a / b;
    
    System.out.println(multiply.operate(2, 3));
    System.out.println(calculate(9, 3, divide));
    System.out.println(calculate(9, 3, addition));
    System.out.println(calculate(9, 3, subtract));
    
  }
}
