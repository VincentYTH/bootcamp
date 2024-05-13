public class Person {
  void read(){
    System.out.println("I am reading...");
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.read();

    Person p2 = new Person(){
      @Override
      public void read(){
        System.out.println("Im am reading too");
      }
    };
    p2.read();
  }
}
