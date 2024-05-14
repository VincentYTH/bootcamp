package com.bootcamp.demo2403;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class Customer {
  private String name;
  private List<Order> orders;

  public Customer(String name){
    name = this.name;
    orders = new LinkedList<>();
  }

  public void add(Order order){
    orders.add(order);
  }

  public void remove(Order order){
    orders.remove(order);
  }

  public int orderCount(){
    return this.getOrders().size();
  }

  public static int orderCount(Customer c){
    return c.getOrders().size();
  }

  public boolean isVIP(){
    return this.orderCount() >= 10;
  }

}
