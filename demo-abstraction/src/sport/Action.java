package sport;

public interface Action {
  
  void run();
  void walk();

  // Java 8
  default void swim(){ // instance method ny inheritance
    System.out.println("Default method: swim...");
  }
  static void sleep(){ // normal static method
    System.out.println("Static method: sleep...");
  }

  public static void main(String[] args) {
    Person p = new Person();
    p.swim();
  }
}
