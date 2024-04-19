package sport;

public class Person implements Action {
  
  @Override
  public void run(){
    System.out.println("Running");
  }

  @Override
  public void walk(){
    System.out.println("Walking");
  }

  // By default, You can still override the defalut method in Interface as below
  @Override
  public void swim(){
    System.out.println("Swimming");
  }

  public void cry(){
    System.out.println("Crying");
  }

  public static void main(String[] args) {
    Action a = new Person();
    // a.cry(); // compile error, Action type does not have cay() method
    Person p = null;
    if (a instanceof Person) {
      p = (Person) a;
      p.cry();
    }
    p.cry();
  }
}
