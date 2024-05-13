package ForPractise;
import java.util.LinkedList;
import java.util.List;

public class CustomerBook {
  private List<Customer> customerBook;

  public CustomerBook(){
    this.customerBook = new LinkedList<>();
  }
  
  public void addCustomer(Customer customer){
    this.customerBook.add(customer);
  }

  public String toString(){
    return "Customer Book{"
    + this.customerBook + "}";
  }

  public static void main(String[] args) {
    CustomerBook book = new CustomerBook();
    book.addCustomer(Customer.builder()
    .setCustomerName("HSBC")
    .setCreditLimit(800000)
    .setSection(Customer.Section.TWO)
    .build()
    );

    book.addCustomer(Customer.builder()
    .setCustomerName("BOCHK")
    .setCreditLimit(600000)
    .setSection(Customer.Section.ONE)
    .build()
    );

    System.out.println(book);
  }
}
