import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Customer {

  public static void main(String[] args) {
    Optional<String> result = null;
    result = Optional.of("Hi");
    result = Optional.empty();

    String str = "hello";
    int x = 10;
    if (x >= 10)
      str = null;
    result = Optional.ofNullable(str); // can store null or non-null object
    // Optional.of(null); // NPE

    List<String> names = new ArrayList<>(List.of("Vincent", "Jenny", "Oscar"));
    // stream
    List<Optional<String>> result2 = names.stream()
    .map(e -> Optional.ofNullable(e))
    // .map(Optional::ofNullable) // method reference
    .collect(Collectors.toList());

    System.out.println(result2);
  }

  private Optional<String> name;

  // getter / setter should not return Optional<T>
  public Optional<String> getName(){ // getName() well-known method -> no need to use "Optional"
    return this.name;
  }

  // deserialization / serialization 序列化
  // {
  //   "name" : "John"
  // }

  // Java Object <-> JSON (deserialization / serialization)
  // Optional cannot be supported by deserialization / serialization

  public static Double sum(Double d1, Double d2){
    if (d1 == null || d2 == null)
      throw new IllegalArgumentException();
    return d1.doubleValue() + d2.doubleValue();
  }
}
