public class CustomerV {
  
  private String customer;//Sales Area 1: HSBC, BOCHK; Sales Area 2: BEA, SCB; Sales Area 3: AEON, CITI
  private int salesArea;

  public void setCustomer(String customer){
    this.customer=customer;
    switch(customer){
      case "HSBC":
      this.salesArea=1;
      break;
      case "BOCHK":
      this.salesArea=1;
      break;
      case "BEA":
      this.salesArea=2;
      break;
      case "SCB":
      this.salesArea=2;
      break;
      case "AEON":
      this.salesArea=3;
      break;
      case "CITI":
      this.salesArea=3;
      break;
    }
  }

  public String toString(){
    return "The customer "//
    +this.customer//
    +" belongs to salesArea"//
    +this.salesArea//
    +".";
  }


  public static void main(String[] args) {
  CustomerV c1 = new CustomerV();
  CustomerV c2 = new CustomerV();
  c1.setCustomer("HSBC");
  c2.setCustomer("CITI");
  System.out.println(c1.toString());
  System.out.println(c2.toString());
  }

}