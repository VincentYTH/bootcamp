import java.util.Objects;

public class Customer {
  
  private String name;

  public Customer(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Customer))
    return false;
    Customer c = (Customer) o;
    return Objects.equals(this.name, c.getName());
  }

  //   @Override
  //   public int hashCode(){
  //     return Objects.hash(this.name);
  // }

  @Override
  public String toString(){
    return "Customer(name = "
    + this.name;
  }
}
