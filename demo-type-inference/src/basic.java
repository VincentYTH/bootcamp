import java.util.List;
import java.util.function.Predicate;

public class basic {
  public static void main(String[] args) {
    String x = "hello";

    // After Java 10
    var x2 = "hello"; // compile-time: compiler knows x2 is with type String
    // String x2 = "hello";
    var age = 3;
    var name = "Vincent";

    var names = List.of("Vincent", "Oscar");
    // List<String> = ..

    for (var n : names){
      System.out.println(n);
    }

    var dog = new Dog();
    // var cat;

    Predicate<String> isTooLong = s -> s.length() > 10;
    // var isTooLong = s -> s.length() > 10;

    var arr = new int[] {1, 2, 3};
    // var arr = {1, 2, 3}; // int[] or double[] or ......
  }
  
  // Cannot Do in "var"
  // 1. return type
  // public static var print(){}

  // 2. instance variable
  // refer to Dog.class

  // 3. without initialization
  // var n;

  // 4. Lambda
  // var isTooLong = s -> s.length() > 10;

  // 5. Array
  // var arr = {1, 2, 3}; 

  // 6. input parameter
  // public static int sum(var x, var y){
  //   return x + y;
  // }
}
