package buildin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  public static void main(String[] args) { // [basic]
    // y = f(x)
    // y = x + 1

    // Function: 左邊入，右邊出
    Function<String, Integer> function = s -> s.length();
    System.out.println(function.apply("hello")); // 5

    // BiFunction: 兩個入， 一個出
    BiFunction<String, String, Integer> totalLength = (s1, s2) -> s1.length() + s2.length();
    System.out.println(totalLength.apply("Abc", "hello")); // 8

    // Why do we need to learn BiFunction
    Map<String, Integer> nameLengthMap = new HashMap<>();
    nameLengthMap.put("John", 4);
    nameLengthMap.put("Sally", 5);

    Function<String, Integer> nameLength = s -> s.length();
    nameLengthMap.computeIfAbsent("Vincent", nameLength); // if "Vincent" does not exists -> call nameLength
    nameLengthMap.computeIfAbsent("Oscar", s -> s.length());
    System.out.println(nameLengthMap); // {Vincent=7, Sally=5, John=4, Oscar=5}

    // merge()
    System.out.println(nameLengthMap.merge("Vincent", 9, (o, n) -> o * n)); // 7 * 9 = 63

  }
}
