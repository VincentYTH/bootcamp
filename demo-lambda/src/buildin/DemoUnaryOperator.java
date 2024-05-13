package buildin;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator { // [clear style]
  public static void main(String[] args) {
    Function<String, Integer> getLength = s -> s.length();

    // Function<T, T>
    UnaryOperator<String> addHello = s -> s.concat("Hello");

    // Function<T, T, T>
    BiFunction<Integer, Integer, Integer> sum2 = (x, y) -> x + y;
    BinaryOperator<Integer> sum = (x, y) -> x + y;

    // toUpperCase
    UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
    System.out.println(toUpperCase.apply("abc"));

    StringFormula formula = (x, y, z) -> x.toUpperCase().replace(y, z);
    System.out.println(formula.uppercaseNreplace("hello", "LL", "AB")); // HEABO
  }
}
