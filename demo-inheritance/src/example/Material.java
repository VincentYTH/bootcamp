package example;

public class Material {
  
  private double price;
  private int quantity;

  public Material(double price, int quantity){
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public double getPrice(){
    return this.price;
  }

  public void setQuantity(int quantities){
    this.quantity = quantities;
  }

  public int getQuantity(){
    return this.quantity;
  }

}
