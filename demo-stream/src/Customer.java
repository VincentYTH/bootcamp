import java.util.Objects;

public class Customer {
  private int age;
  private String name;

  public Customer(int age, String name){
    this.age = age;
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return "Customer (" + this.name + ", age " + this.age + ")";
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
      return true;
    if (!(o instanceof Customer))
      return false;
    Customer customer = (Customer) o;
    return Objects.equals(this.name, customer.getName())
        && Objects.equals(this.age, customer.getAge());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.age, this.name);
  }

}
