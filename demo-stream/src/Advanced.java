import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advanced{ // a stream can only be terminal once
  public static void main(String[] args) {
    Stream<String> empty = Stream.empty(); // static method -> constructor -> new Stream object
    System.out.println(empty.count()); // 0

    Stream<String> strings = Stream.of("Hello", "abc");
    // filter, collect...

    Stream<Integer> integers = Stream.iterate(1, n -> n + 2).limit(10);
    System.out.println(integers.collect(Collectors.toList())); // [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

    strings = strings.filter(e -> e.length() > 3); // intermediate operation -> new Stream
    // .count(); // terminal operation
    System.out.println(strings.collect(Collectors.toList())); // terminal operation: [Hello]

    // strings.forEach(e -> {}); // terminal operation -> run-time error

    // sorted() (should sort after filt)
    List<Integer> integers2 = new ArrayList<>(List.of(400, 3, -1, 0, 100, -200));
    integers2 = integers2.stream()
      .filter(e -> e.compareTo(0) >= 0)
      .sorted() // interminate opreation
      .collect(Collectors.toList());
    System.out.println(integers2); // [0, 3, 100, 400]

    List<Customer> customers = new LinkedList<>(List.of(new Customer(20, "Sally"), new Customer(30, "Janet"), new Customer(40, "Mabel"), new Customer(50, "Janet")));

    Comparator<Customer> sortByAgeapp = (c1, c2) -> c1.getAge() > c2.getAge() ? 1 : -1;
    // Comparator<Customer> sortByAgeDes = (c1, c2) -> c1.getAge() > c2.getAge() ? -1 : 1;

    customers = customers.stream()
      .sorted(sortByAgeapp) // Comparator object
      .collect(Collectors.toList());
    System.out.println(customers); // [Customer (Mabel, age 40), Customer (Janet, age 30), Customer (Sally, age 20)]

    // List<Customer> -> List<String> (Type change)
    Set<String> names = customers.stream()
      .filter(e -> e.getAge() >= 30) // filter object
      .map(e -> e.getName()) // （map: 提取） type change: Customer -> String
      .sorted()
      .collect(Collectors.toSet());
    System.out.println(names); // [Janet, Mabel]

    Stream.of(1, 2, 3).map(i -> {
      System.out.println(i); // print nothing since the "map" function is not a terminal operation
      return i + 1;
    // }).count(); // printing nothing since map() won't affect the result of count, so Stream would not execute map function if the terminal operation is count()
    }).forEach(e -> System.out.println(e)); // forEach is terminal then printing

  }
}
