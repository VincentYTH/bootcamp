package exericise;

public class Person implements Exericese, Work {
  //public class Person implements Run, Walk {
  
  @Override
  public void run(){

  }

  @Override
  public void walk(){
    
  }

  @Override
  public void swim(){

  }

  @Override
  public void work(){

  }


  public static void main(String[] args) {
    Run vincent = new Person();
    vincent.run();

    Walk vincent2 = new Person();
    vincent2.walk();
    Person p = (Person) vincent2;
    p.run();
    p.walk();
    p.swim();

    Exericese vincent3 = new Person();
    vincent3.run();
    vincent3.walk(); 
    vincent3.swim();
    // vincent3.work(); // Exericese is not implements work
  }
}
