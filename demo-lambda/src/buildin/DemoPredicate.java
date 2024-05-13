package buildin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) { // [boolean]
    // int age = 18;
    // boolean isElderly = age > 65;

    Predicate<Integer> isEldery = x -> x > 65;

    System.out.println(isEldery.test(65)); // false
    System.out.println(isEldery.test(66)); // true

    Predicate<String> containsABC = x -> x.contains("abc");
    System.out.println(containsABC.test("Vcinbcentabc")); // true

    BiPredicate<String, Integer> isCharacterS = (str, idx) -> str.charAt(idx) == 's';
    System.out.println(isCharacterS.test("abs", 2)); // true

    BiPredicate<String, String> startWith = (x, y) -> x.startsWith(y);
    System.out.println(startWith.test("hello", "he")); // true

    BiPredicate<String, String> endWith = (a, b) -> a.endsWith(b);
    System.out.println(endWith.test("hello", "lo")); // true

    BiPredicate<String, String> combinedAnd = startWith.and(endWith);
    System.out.println(combinedAnd.test("loeelo", "lo")); // true

    BiPredicate<String, String> combinedOr = startWith.or(endWith);
    System.out.println(combinedOr.test("hello", "he")); // true

    BiPredicate<String, Integer> lengthLargerThan = (s1, length) -> s1.length() > length;
    System.out.println(lengthLargerThan.test("hello", 6)); // false
  }
}
