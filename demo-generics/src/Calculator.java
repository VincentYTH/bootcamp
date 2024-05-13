import java.math.BigDecimal;

public class Calculator<T extends Number> {

  private T x;
  private T y;

  public double sum3(T x, T y){
    return x.doubleValue() + y.doubleValue();
  }

  public static int sum(int x, int y){
    return x + y;
  }

  // "<T extends Number>" implies x and y are the objects 
  // that belong to int~double so that cannot pass a String obj.
  public static <T extends Number, swim> double sum(T x, T y){
    return BigDecimal.valueOf(x.doubleValue()).add(BigDecimal.valueOf(y.doubleValue())).doubleValue();
  }

  public static double sum2(Number x, Number y){
    return BigDecimal.valueOf(x.doubleValue()).add(BigDecimal.valueOf(y.doubleValue())).doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(sum(2.3f, 3.2d));
    System.out.println(sum2(2L, 1.12));

    Calculator<Long> calculator = new Calculator<>();
    System.out.println(calculator.sum3(Long.valueOf(10), Long.valueOf(5)));

    Calculator.sum(new SuperLong(), new SuperLong());
  }
} 
