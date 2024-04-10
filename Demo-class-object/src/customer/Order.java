package customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  
  private String orderNo;

    //One order has many items
  private Item[] items;


  public Order(String orderNo){
    this.orderNo = orderNo;
    this.items = new Item[0];
  }

  public double total(){
    BigDecimal total = BigDecimal.valueOf(0.0d);
    for (int i=0; i<items.length; i++){
      total = total.add(BigDecimal.valueOf(items[i].subTotal()));
    }
    return total.doubleValue();
  }

  public void addItem(Item item){
    Item[] copyArr = this.items;
    this.items = new Item[this.items.length + 1];
    for (int i=0; i<copyArr.length; i++){
      items[i] = copyArr[i];
    }
    items[copyArr.length] = item;
  }

  public String toString(){
    return "Order("//
    + "orderNo= " + this.orderNo//
    +", items" + Arrays.toString(this.items)//
    +")";
  }

}
