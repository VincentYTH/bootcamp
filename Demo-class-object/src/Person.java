public class Person {

  private int age;

  //private double salary;

  //getter and setter for age

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

    Person person2=new Person();
    person2.setAge(64);
    System.out.println(person2.isElderly());//false
  }

}