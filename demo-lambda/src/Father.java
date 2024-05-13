public class Father implements Swim {

  @Override
  public void swim(){

  }

  public static void main(String[] args) {
    // Before Lambda
    Father father = new Father();
    father.swim();

    // After Lambda (after Java 8)
    Swim father2 = () -> {
      System.out.println("Hi");
      System.out.println("I am swimming");
    };
    father2.swim();

    Swim mother = () -> {
      System.out.println("I am mother");
      System.out.println("Hello");
    };
    mother.swim();


  }
}
