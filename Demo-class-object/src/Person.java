public class Person {

  private int age;

  //private double salary;

  //getter and setter for age

  public Person(){//the empty constructor need to reset since the age constructor has been setted

  }

  public Person(int age){
    this.age=age;
  }

  public void setAge(int age){
    this.age=age;
  }

  public int getAge(){
    return this.age;
  }

  public boolean isElderly(){
    return this.age>=65;
  }

  public static void main(String[] args) {
    Person person=new Person();
    person.setAge(65);
    System.out.println(person.isElderly());//true

    Person person2=new Person(64);
    System.out.println(person2.isElderly());//false

    Person person3=new Person(3);
    System.out.println(person3.isElderly());//false

    boolean isElderly=new Person(70).isElderly();//flase - but will lose the object of "new Person(70)"
  }

}