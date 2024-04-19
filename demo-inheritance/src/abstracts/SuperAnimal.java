package abstracts;

public abstract class SuperAnimal extends SuperObject{// 1. You cannot create an object for an abstract class SuperAnmial
  
  private String name;

  public SuperAnimal(){// 2. Abstract class is still having constructor, even cannot new a obj

  }

  public SuperAnimal(String name){
    this.name = name;
  }

  public abstract void eat();// 3. Abstract method, but it is a method signature only
  // the child class has to implement it

  // 4. Automatically inherits abstract method from parent abstract class

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void sleep(){
    System.out.println("Animal is sleeping");
  }

  public void run(){
    System.out.println("Animal is running");
  }

  public final void swim(){ // cannnot be overrided
    System.out.println("Animal is swimming");
  }

  public static void main(String[] args) {
    // SuperAnimal sa = new SuperAnimal(); -> Cannot create


  }
}
