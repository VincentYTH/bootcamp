package customer;

import java.math.BigDecimal;

public class Item {

  private String desc;//description

  private double price;

  private int quantity;


  public Item(String desc, double price, int quantity){
    this.desc=desc;
    this.price=price;
    this.quantity=quantity;
  }

  public double subTotal(){
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  }

  public String toString(){
    return "Item("//
    + "description " + this.desc//
    + " price " + this.price//
    + " quantity " + this.quantity//
    + ")";
  }

  public static void main(String[] args) {
    Item item1 = new Item("Apple", 4.5, 2);
    System.out.println(item1.subTotal());//9.0
    Item item2 = new Item("Orange", 5.0, 4);
    System.out.println(item2.subTotal());//20.0
    // Item[] items = new Item[2];
    // items[0] = item1;
    // items[1] = item2;

    Order order1 = new Order("V001");
    // orders[0] = order1;

    order1.addItem(item1);
    System.out.println(order1);
    order1.addItem(item2);
    System.out.println(order1);
    System.out.println(order1.total());// 29.0

    //*System.out.println(order1.total());

    //order2
    // Order[] orders = new Order[2];
    Customer c = new Customer("Vincent");
    c.addOrder(order1);
    System.out.println(c);
  }









}
