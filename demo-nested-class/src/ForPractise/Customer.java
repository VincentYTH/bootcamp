package ForPractise;
public class Customer {
  private String name;
  private int creditLimit;
  private Section section;

  public enum Section{
    ONE, TWO, Three;
  }

  public Customer(CustomerBuilder customerBuilder){
    this.name = customerBuilder.name;
    this.creditLimit = customerBuilder.creditLimit;
    this.section = customerBuilder.section;
  }

  public static class CustomerBuilder {
    private String name;
    private int creditLimit;
    private Section section;

    public CustomerBuilder setCustomerName(String name){
      this.name = name;
      return this;
    }

    public CustomerBuilder setCreditLimit(int creditLimit){
      this.creditLimit = creditLimit;
      return this;
    }

    public CustomerBuilder setSection(Section section){
      this.section = section;
      return this;
    }

    public Customer build(){
      return new Customer(this);
    }
  }

  public static CustomerBuilder builder(){
    return new CustomerBuilder();
  }

  public String toString(){
    return "Customer(Name = "
    + this.name + ", Credit Limited = "
    + this.creditLimit + ", Section = "
    + this.section + ")";
  }

  public static void main(String[] args) {
    Customer c1 = new Customer.CustomerBuilder()
    .setCustomerName("BOCHK")
    .setCreditLimit(600000)
    .setSection(Section.ONE)
    .build();
    System.out.println(c1);

    Customer c2 = Customer.builder()
    .setCustomerName("HSBC")
    .setCreditLimit(800000)
    .setSection(Section.TWO)
    .build();
    System.out.println(c2);
  }
}
