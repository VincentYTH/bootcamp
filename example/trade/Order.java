package trade;

public class Order {

  private double price;
  private int quantities;
  
  public Order (double price, int quantities){
    this.price = price;
    this.quantities = quantities;
  }

  public double getPrice(){
    return this.price;
  }

  public int getQuantities(){
    return this.quantities;
  }

}
