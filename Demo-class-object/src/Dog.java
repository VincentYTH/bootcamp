public class Dog {

  private String firstName;
  private String lastName;
  private int age;

  public void SetFistName(String firstName){
    this.firstName=firstName;
  }

  public void SetLastName(String lastName){
    this.lastName=lastName;
  }

  public void SetAge(int age){
    this.age=age;
  }

  // public String getFirstName(){
  //   return firstName;
  // }

  // public String getLastName(){
  //   return lastName;
  // }

  // public int getAge(){
  //   return age;
  // }

  public String toString(){
    return "Dog("//
    +"firstName="+this.firstName//
    +", lastName="+this.lastName//
    +", age="+this.age+")";
  }

  public String toStringFullName(){
    // return this.firstName+" "+this.lastName;
    return this.firstName.concat(" ").concat(this.lastName);
  }

  public static void main(String[] args) {
    Dog dog=new Dog();
    dog.SetFistName("John");
    dog.SetLastName("Lau");
    dog.SetAge(8);
    System.out.println(dog.toString());//"Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.toStringFullName());//"John Lau"

    Square square=new Square();
    square.setLength(13);
    System.out.println(square.toString());//"Square(length=13)"
    System.out.println(square.getArea());//169

    
  }
}
