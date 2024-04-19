public class Cat extends Animal{
  
  // Child Class cat inherit all instance variables, instance methods from Parent (super) Class Animal
  // but it does not inherit constructor

  public static String y = "DEF";

  private int age;

  private String name;

  // public Cat(int age){
  //   // super(); // create Animal's constructor
  //   this.age = age;
  // }

  public Cat(){

  }

  public Cat(int age, String name, double weight){
    super(name, weight);// call Class Animal construtor
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
    super.sleep();// call Class Animal - sleep method
  }

  @Override
  public String getName(){
    return this.name;
  }

  @Override
  public void setName(String name){// if this class is duplicated with the extend one, the priority of this class is higher
    this.name = name;
    System.out.println("call cat");
  }

  // Approach 1
  public String getCatName(){// Method name must be individual
    return this.name;
  }

  public void setCatName(String name){
    this.name = name;
  }

  // Approach 2
  public String getAnimalName(){
    return "name: " + super.getName();
  }

  @Override
  public void sleep(){
    System.out.println("Cat is sleeping");
  }

  public void run(){
    System.out.println("Cat is running");
  }

  public String upperX(){
    return Animal.x.toUpperCase();
  }

  public static void main(String[] args) {
    Cat cat = new Cat(0, "Bob", 20);
    cat.setName("John");// need extends since the method belongs to Animal
    cat.setName("Dannie");
    System.out.println(cat.getName());
    cat.setAge(3);
    cat.sleep();
    cat.run();
    System.out.println(cat.getAge());

    Cat cat2 = new Cat(2, "Jenny", 22);
    System.out.println(cat2.getAnimalName());
    System.out.println(cat2.upperX());// ABC
    System.out.println(cat2.lowerY());// def

    // New Animal
    Animal animal = new Animal("aa", 12);
    animal.setName("Roy");// no need extends
    System.out.println(animal.lowerY());// def
    // Another child class extends Animals
    }
}
