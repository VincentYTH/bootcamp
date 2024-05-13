package buildin;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier { // 冇入有出
  public static void main(String[] args) {
    Supplier<String> hello = () -> "hello";
    System.out.println(hello.get()); // return String value

    Supplier<Weekday> monday = () -> Weekday.MONDAY;

    printName(monday);

    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());

    Supplier<Integer> random = () -> new Random().nextInt(10) + 1; // 0 - 9 + 1 -> 1 - 10
    System.out.println(random.get());

  }

  public static void printName(Supplier<Weekday> day){
    System.out.println(day.get());
  }
}
