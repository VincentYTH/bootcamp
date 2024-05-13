import java.util.List;
import java.util.Optional;

public class Basic {
  public static void main(String[] args) {
    System.out.println(upperName("Steven")); // Optional[STEVEN]
    System.out.println(upperName("Steven").get()); // STEVEN
    System.out.println(upperName(null)); // Optional.empty

    Optional<String> result = upperName(null);

    // 1. ifPresent()
    result.ifPresent(e -> {
      System.out.println("HI" + e.charAt(0)); // e must be non-null value
    });

    upperName(null).ifPresent(e -> {
      System.out.println("HI" + e.charAt(0)); // e must be non-null value
    });

    // 2. isPresent()
    Optional<String> name = Optional.of("Vincent");
    if (name.isPresent()){ // if name is value then return true
      System.out.println("example1 = " + name.get().charAt(0)); // No risk on NPE(Null Pointer Exception)
    } else {
      System.out.println("example2 = " + name.get()); // Optional.empty -> null
    }

    // 3. orElse
    name = Optional.ofNullable(null);
    String user = name.orElse("Jenny"); // T
    System.out.println(user); // Vincent

    // 4. orElseGet
    String user2 = name.orElseGet(() -> "Jenny"); // Supplier<T>
    System.out.println(user2); // Vincent

    // 5. orElseThrow
    // String user3 = name.orElseThrow(() -> new RuntimeException());
    // System.out.println(user3); // throw exception

    // 6. stream and optional
    Cat cat = List.of(new Cat(3, "Vincent"), new Cat(6, "Oscar"), new Cat(4, "Vincent"), new Cat(5, "Jenny"))
        .stream()
        .filter(e -> "Vincent".equals(e.getName()))
        .findFirst() // Optional<Cat>
        .orElse(new Cat(0, "Vincent"));
    System.out.println(cat.getAge()); // 3

    List.of(new Cat(3, "Vincent"), new Cat(6, "Oscar"), new Cat(4, "Vincent"), new Cat(5, "Jenny"))
        .stream()
        .filter(e -> "Vincent".equals(e.getName()))
        .findFirst()
        .ifPresent(e -> {
          System.out.println(e.getAge()); // 3
        });
  }

  public static Optional<String> upperName(String name){
    // if (name == null)
    //   throw new IllegalArgumentException();
    if (name != null)
      return Optional.of(name.toUpperCase());
    return Optional.empty(); // object, not a null value
  }
}