public class Person1 {
  void read(){
    System.out.println("I am reading...");
  }

  public static void main(String[] args) {
    Person1 p1 = new Person1();
    p1.read();

    Person1 p2 = new Person1(){
      @Override
      public void read(){
        System.out.println("Im am reading too");
      }
    };
    p2.read();
  }
}
