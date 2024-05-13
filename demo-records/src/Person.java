public record Person(String name, int age) {

  public static int x = 10;

  public static int getX(){
    return x;
  }

  @Override // also can override getter, equals(), hashcode()......
  public String name(){
    return "hello";
  }

  public static void main(String[] args) {
    // only one constructor - all args
    Person p1 = new Person("Vincent", 18);
    Person p2 = new Person("Vincent", 18);

    // default equeals() & hashcode()
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.hashCode() == p2.hashCode()); // true

    // default toString()
    System.out.println(p1.toString()); // Person[name=Vincent, age=18]

    // default getter
    System.out.println(p1.name()); // Vincent -> hello
    System.out.println(p1.age()); // 18

    // no setter
  }
}