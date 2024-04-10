package customer;//subfolder

import java.util.Arrays;

public class Customer {
  
  private String username;

  //One Customer has many orders
  private Order[] orders;
  

  public Customer(String username){
    this.username=username;
    this.orders=new Order[0];
  }

  public void addOrder(Order order){
    Order[] copyArr = this.orders;
    this.orders = new Order[this.orders.length + 1];
    for (int i=0; i<copyArr.length; i++){
      orders[i] = copyArr[i];
    }
    orders[copyArr.length] = order;
  }

  public String toString(){
    return "Customer("//
    + "username= " + this.username//
    + ", orders" + Arrays.toString(this.orders);
  }

}
