public class Dog {

  private String firstName;
  private String lastName;
  private int age;

  public Dog(){

  }

  public Dog(String firstName, String lastName, int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
  }

  public Dog(String firstName){
    this.firstName=firstName;
    this.lastName="Chan";
    this.age=0;
  }

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
    Dog dog=new Dog("John","Lau",8);
    dog.SetFistName("John");
    dog.SetLastName("Lau");
    dog.SetAge(8);
    System.out.println(dog);//"Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.toString());//"Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.toStringFullName());//"John Lau"

    Dog dog2=null;
    //dog2.setAge(4);//NPE: null pointer exception

    Dog dog3=new Dog("Ken","Wong",13);
    System.out.println(dog3);

    Dog dog4=new Dog("Joe");
    System.out.println(dog4);
  }
}
