package abstracts;

public final class SuperCat extends SuperAnimal {

  private int age;

  public SuperCat(){

  }

  public SuperCat(int age, String name) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void sleep() {
    System.out.println("Cat is sleeping");
  }

  public void run() {
    System.out.println("Cat is running");
  }

  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }

  @Override
  public void sit() {
    System.out.println("Cat is sitting");
  }


  public static void main(String[] args) {
    SuperCat sc = new SuperCat(3, "Jenny");
    System.out.println(sc.getName());
    System.out.println(sc.getAge());
    sc.sleep();
    sc.run();
    sc.eat();
    sc.sit();

    SuperCat sc2 = sc;
    System.out.println(sc2 == sc); // true
    System.out.println(sc2.equals(sc)); // true
  }
}
