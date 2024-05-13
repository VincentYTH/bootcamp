@FunctionalInterface
public interface Calculator {
  int square(int x);

  public static void main(String[] args) {
    Calculator cal = (x) -> {
      return (int) Math.pow(x, 2);
    };

    // if we have only one parameter in the method of FunctionalInterface:
    Calculator cal2 = x -> (int) Math.pow(x, 2);

    Calculator cal3 = x -> 3;

    System.out.println(cal.square(2));
    System.out.println(cal2.square(2));
    System.out.println(cal3.square(2));
  }
}
