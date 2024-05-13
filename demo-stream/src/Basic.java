import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Basic {
  public static void main(String[] args) {
    List<Integer> integers = new LinkedList<>();
    integers.add(21);
    integers.add(44);
    integers.add(100);
    integers.add(101);

    // List of Odd number
    List<Integer> OddIntegers = new LinkedList<>();
    for (Integer num : integers){
      if (num % 2 == 1)
        OddIntegers.add(num);
    }
    System.out.println(OddIntegers); // [21, 101]

    // Stream
    List<Integer> result = integers.stream() // -> Stream<Integer>
      .filter(e -> e % 2 == 1) // Stream<Integer>
      .collect(Collectors.toList()); // -> List<Integer>
    System.out.println(result); // [21, 101]

    List<Integer> result2 = integers.stream()
      .filter(e -> e % 2 == 1)
      .filter(e -> e > 100)
      .collect(Collectors.toList());
    System.out.println(result2); // [101]

    List<Integer> result3 = integers.stream()
      .filter(e -> e % 2 == 1 && e > 100)
      .collect(Collectors.toList());
    System.out.println(result3); // [101]

    List<Integer> integers2 = new LinkedList<>(List.of(101, 101, 203, 300));
    List<Integer> result4 = integers2.stream()
      .distinct() // remove duplicated
      .collect(Collectors.toList());
    System.out.println(result4); // [101, 203, 300]

    // Counting
    Long size = integers2.stream()
      .filter(e -> e < 200)
      .distinct()
      .count();
    System.out.println(size); // 1

    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer(30, "Daniel"));
    customers.add(new Customer(36, "Ray"));

    List<Customer> MiddleCustomers = customers.stream() // new Stream<Customer>
      .filter(e -> e.getAge() >= 35) // 
      .collect(Collectors.toList()); // new Arraylist() -> new Customer Ray
    System.out.println(MiddleCustomers);

    customers.get(1).setAge(20); // updating customers -> MiddleCustomers has also been updated
    System.out.println(MiddleCustomers); // [Customer (Ray, age 20)]

    String[] strings = new String[] {"abc", "Akjf", "a", "bcd", "aaa"};
    // stream -> start with "a"
    List<String> stringList = Arrays.asList(strings);
    List<String> startWitha = stringList.stream()
      .filter(e -> e.startsWith("a"))
      .collect(Collectors.toList());
    System.out.println(startWitha); // [abc, a, aaa]

    // List to Array
    // Approach 1
    String[] stringsStartWitha = startWitha.toArray(new String[startWitha.size()]);
    System.out.println(Arrays.toString(stringsStartWitha)); // [abc, a, aaa]
    // Approach 2
    String[] arr = startWitha.stream().toArray(s -> new String[s]);
    System.out.println(Arrays.toString(arr)); // [abc, a, aaa]

    // Method Reference
    Function<String, Integer> stringTOInteger = Integer::valueOf;
    Integer number = stringTOInteger.apply("123");
    System.out.println(number);

  }

  public static List<Integer> getOdds(List<Integer> integers){
    return integers.stream()
    .filter(e -> e % 2 == 1)
    .collect(Collectors.toList());
  }
}
